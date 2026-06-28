package com.lumma.backend.repository;

import com.lumma.backend.entity.Task;
import com.lumma.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByUser(User user);
    List<Task> findByUserId(UUID userId);

}