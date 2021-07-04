package tech.newroz.projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.newroz.projectmanager.exception.ProjectNotFoundException;
import tech.newroz.projectmanager.model.Project;
import tech.newroz.projectmanager.repo.ProjectRepo;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepo projectRepo;
    @Autowired
    public ProjectService(ProjectRepo projectRepo){
        this.projectRepo = projectRepo;
    }

    public Project addProject(Project project){
        return projectRepo.save(project);
    }

    public List<Project> findAllProjects(){
        return projectRepo.findAll();
    }

    public Project updateProject(Project project){
        return projectRepo.save(project);
    }
    public Project findProjectById(Long id){
        return projectRepo.findProjectById(id)
                .orElseThrow(() -> new ProjectNotFoundException("Project by id "+ id + " was not found"));
    }

    public void deleteProject(Long id){
        projectRepo.deleteProjectById(id);
    }
}
