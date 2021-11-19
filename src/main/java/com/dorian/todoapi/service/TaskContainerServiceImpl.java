package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.model.TaskContainerModel;
import com.dorian.todoapi.persistence.repository.TaskContainerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TaskContainerServiceImpl implements TaskContainerService {

    private final TaskContainerRepository taskContainerRepository;

    @Override
    public TaskContainerModel findTaskContainerByUuid(String uuid) {
        return taskContainerRepository.findByUuid(uuid);
    }

    @Override
    public TaskContainerModel save(TaskContainerModel taskContainerModel) {
        return taskContainerRepository.save(taskContainerModel);
    }
}
