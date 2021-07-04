package tech.newroz.projectmanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.newroz.projectmanager.model.Project;
import tech.newroz.projectmanager.model.Task;
import tech.newroz.projectmanager.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskResource {
    private final TaskService taskService;

    public TaskResource(TaskService taskService){
        this.taskService = taskService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Task>> getAllTasks () {
        List<Task> tasks = taskService.findAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Task> getTaskById (@PathVariable("id") Long id) {
        Task task = taskService.findTaskById(id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Task> addTask(@RequestBody Task task){
        Task newTask = taskService.addTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Task> updateTask(@RequestBody Task task){
        Task updateTask = taskService.updateTask(task);
        return new ResponseEntity<>(updateTask, HttpStatus.OK);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
