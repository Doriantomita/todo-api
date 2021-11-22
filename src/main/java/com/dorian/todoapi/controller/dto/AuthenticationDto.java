package com.dorian.todoapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthenticationDto {

    @NotBlank
    @JsonProperty(value = "username")
    private String username;

    @NotBlank
    @JsonProperty(value = "password")
    private String password;

}
