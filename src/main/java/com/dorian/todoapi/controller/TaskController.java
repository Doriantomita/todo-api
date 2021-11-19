package com.dorian.todoapi.controller;

import com.dorian.todoapi.controller.dto.CreateTaskDto;
import com.dorian.todoapi.controller.dto.DisplayTaskDto;
import com.dorian.todoapi.facade.TaskFacade;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskFacade taskFacade;

    @PostMapping("/{parentContainerUuid}")
    public ResponseEntity<DisplayTaskDto> createTask(@PathVariable(value = "parentContainerUuid") String taskContainerUuid,
                                                     @RequestBody CreateTaskDto createTaskDto){
        return new ResponseEntity<>(taskFacade.createTask(taskContainerUuid, createTaskDto), HttpStatus.CREATED);
    }
}
