package com.dorian.todoapi.service;

import com.dorian.todoapi.exception.TaskContainerNotFoundException;
import com.dorian.todoapi.persistence.model.TaskContainerModel;
import com.dorian.todoapi.persistence.repository.TaskContainerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@AllArgsConstructor
@Service
public class TaskContainerServiceImpl implements TaskContainerService {

    private final TaskContainerRepository taskContainerRepository;

    @Override
    public TaskContainerModel findTaskContainerByUuid(String uuid) {
        return taskContainerRepository.findByUuid(uuid).orElseThrow(() -> new TaskContainerNotFoundException(
                MessageFormat.format("TaskContainer with uuid {0} not found", uuid)
        ));
    }

    @Override
    public TaskContainerModel save(TaskContainerModel taskContainerModel) {
        return taskContainerRepository.save(taskContainerModel);
    }

    @Override
    public void deleteTaskContainer(String uuid) {
        taskContainerRepository.delete(findTaskContainerByUuid(uuid));
    }
}
