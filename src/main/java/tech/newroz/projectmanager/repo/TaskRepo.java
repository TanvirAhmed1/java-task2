package tech.newroz.projectmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.newroz.projectmanager.model.Task;

import java.util.Optional;

public interface TaskRepo extends JpaRepository<Task, Long> {
    Optional<Task> findTaskById(Long id);

    void deleteTaskById(Long id);
}
