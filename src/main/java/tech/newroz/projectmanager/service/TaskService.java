package tech.newroz.projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.newroz.projectmanager.exception.TaskNotFoundException;
import tech.newroz.projectmanager.model.Task;
import tech.newroz.projectmanager.repo.TaskRepo;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepo taskRepo;
    @Autowired
    public TaskService(TaskRepo taskRepo){
        this.taskRepo = taskRepo;
    }

    public Task addTask(Task task){
        return taskRepo.save(task);
    }

    public List<Task> findAllTasks(){
        return taskRepo.findAll();
    }
    public Task updateTask(Task task){
        return taskRepo.save(task);
    }
    public Task findTaskById(Long id){
        return taskRepo.findTaskById(id).orElseThrow(() -> new TaskNotFoundException("Task by id "+ id + " was not found"));
    }
    public void deleteTask(Long id){
        taskRepo.deleteTaskById(id);
    }
}
