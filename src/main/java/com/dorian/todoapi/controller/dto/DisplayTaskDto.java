package com.dorian.todoapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class DisplayTaskDto {

    @JsonProperty(value = "uuid")
    private String uuid;

    @JsonProperty(value = "taskName")
    private String name;

    @JsonProperty(value = "taskDescription")
    private String description;

    @JsonProperty(value = "taskSteps")
    private List<String> steps;

    @JsonProperty(value = "taskComments")
    private List<String> comments;

    @JsonProperty(value = "assignedUsers")
    private List<DisplayUserDto> assignedUsers;

    @JsonProperty(value = "parentContainer")
    @JsonBackReference
    private TaskContainerDto parentContainer;

    @JsonProperty(value = "color")
    private ColorDto color;

}
