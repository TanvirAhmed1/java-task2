package tech.newroz.projectmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.newroz.projectmanager.model.Project;

import java.util.Optional;

public interface ProjectRepo extends JpaRepository<Project, Long> {
    void deleteProjectById(Long id);

    Optional<Project> findProjectById(Long id);
}
