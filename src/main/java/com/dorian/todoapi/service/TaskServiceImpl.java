package com.dorian.todoapi.service;

import com.dorian.todoapi.exception.TaskNotFoundException;
import com.dorian.todoapi.persistence.model.TaskModel;
import com.dorian.todoapi.persistence.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@AllArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public TaskModel findTaskModelByUuid(String uuid) {
        return taskRepository.findTaskModelByUuid(uuid).orElseThrow(() -> new TaskNotFoundException(
                MessageFormat.format("No task with uuid {0} found", uuid)
        ));
    }

    @Override
    public TaskModel save(TaskModel taskModel) {
        return taskRepository.save(taskModel);
    }

    @Override
    public void deleteTask(String uuid) {
        taskRepository.delete(findTaskModelByUuid(uuid));
    }
}
