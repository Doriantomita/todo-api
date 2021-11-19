package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.model.TaskModel;
import com.dorian.todoapi.persistence.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public TaskModel save(TaskModel taskModel) {
        return taskRepository.save(taskModel);
    }
}
