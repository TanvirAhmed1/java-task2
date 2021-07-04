package tech.newroz.projectmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.newroz.projectmanager.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Long> {
}
