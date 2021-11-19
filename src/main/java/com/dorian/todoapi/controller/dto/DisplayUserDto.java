package com.dorian.todoapi.controller.dto;

import com.dorian.todoapi.persistence.model.TaskModel;
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
public class DisplayUserDto {

    @JsonProperty(value = "uuid")
    private String uuid;

    @JsonProperty(value = "username")
    private String username;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "role")
    private RoleDto role;

    @JsonProperty(value = "assignedTasks")
    private List<TaskModel> assignedTasks;

    @JsonProperty(value = "accessibleBoards")
    @JsonBackReference
    private List<DisplayBoardDto> accessibleBoards;
}
