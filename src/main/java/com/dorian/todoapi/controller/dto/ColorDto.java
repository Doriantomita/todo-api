package com.dorian.todoapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

public class ColorDto {

    @Value(value = "uuid")
    private String uuid;

    @JsonProperty(value = "hexValue")
    private String hexValue;
}
