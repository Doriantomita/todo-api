package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.repository.TaskContainerRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskContainerServiceImpl implements TaskContainerService {

    private TaskContainerRepository taskContainerRepository;

}
