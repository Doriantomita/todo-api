package com.dorian.todoapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    @JsonProperty(value = "username")
    @NotBlank(message = "Username cannot be empty!")
    private String username;

    @JsonProperty(value = "password")
    @NotBlank(message = "Password cannot be empty!")
    private String password;

    @JsonProperty(value = "email")
    @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")
    @NotBlank(message = "Email cannot be empty!")
    private String email;

    @JsonProperty(value = "firstName")
    @NotBlank(message = "First name cannot be empty!")
    private String firstName;

    @JsonProperty(value = "lastName")
    @NotBlank(message = "Last name cannot be empty!")
    private String lastName;
}
