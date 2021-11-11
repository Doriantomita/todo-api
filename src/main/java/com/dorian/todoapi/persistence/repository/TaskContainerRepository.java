package com.dorian.todoapi.persistence.repository;

import com.dorian.todoapi.persistence.model.TaskContainerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskContainerRepository extends JpaRepository<TaskContainerModel, Long> {
}
