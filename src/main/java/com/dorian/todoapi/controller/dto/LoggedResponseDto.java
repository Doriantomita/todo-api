package com.dorian.todoapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoggedResponseDto {

    @JsonProperty(value = "username")
    private String username;

    @JsonProperty(value = "token")
    private String token;
}
