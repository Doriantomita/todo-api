package com.dorian.todoapi.persistence.repository;

import com.dorian.todoapi.persistence.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Long> {

    Optional<TaskModel> findTaskModelByUuid(String uuid);

    void deleteTaskModelByUuid(String uuid);
}
