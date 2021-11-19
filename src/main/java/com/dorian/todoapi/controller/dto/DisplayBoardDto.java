package com.dorian.todoapi.controller.dto;

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
public class DisplayBoardDto {


    @JsonProperty(value = "uuid")
    private String uuid;

    @JsonProperty(value = "value")
    private String name;

    @JsonProperty(value = "createdBy")
    @JsonManagedReference
    private DisplayUserDto createdBy;

    @JsonProperty(value = "accessibleBy")
    @JsonManagedReference
    private List<DisplayUserDto> accessors;

    @JsonProperty(value = "containers")
    @JsonManagedReference
    private List<TaskContainerDto> containers;

    @JsonProperty(value = "isShared")
    private boolean shared;

}
