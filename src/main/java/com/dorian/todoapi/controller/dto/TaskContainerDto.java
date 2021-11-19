package com.dorian.todoapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskContainerDto {

    @JsonProperty(value = "uuid")
    private String uuid;

    @JsonProperty(value = "taskContainerName")
    private String name;

    @JsonProperty(value = "tasks")
    @JsonManagedReference
    private List<DisplayTaskDto> tasks;

    @JsonProperty(value = "parentBoard")
    @JsonBackReference
    private DisplayBoardDto parentBoard;

}
