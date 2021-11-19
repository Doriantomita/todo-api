package com.dorian.todoapi.controller;

import com.dorian.todoapi.controller.dto.CreateTaskContainerDto;
import com.dorian.todoapi.controller.dto.TaskContainerDto;
import com.dorian.todoapi.facade.TaskContainerFacade;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task-containers")
@AllArgsConstructor
public class TaskContainerController {

    private final TaskContainerFacade taskContainerFacade;

    @PostMapping("/{parentBoardUuid}")
    public ResponseEntity<TaskContainerDto> createTaskContainer(@PathVariable(value = "parentBoardUuid") String parentBoardUuid,
                                                                @RequestBody CreateTaskContainerDto createTaskContainerDto) {
        return new ResponseEntity<>(taskContainerFacade.createTaskContainer(parentBoardUuid, createTaskContainerDto),
                HttpStatus.OK);
    }
}
