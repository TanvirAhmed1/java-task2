package tech.newroz.projectmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.newroz.projectmanager.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {
}
