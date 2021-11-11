package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

}
