package com.dorian.todoapi.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
@Getter
@Setter
public class UserModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "username", unique = true)
    @NotBlank(message = "Username cannot be empty!")
    private String username;

    @Column(name = "password")
    @NotBlank(message = "Password cannot be empty!")
    private String password;

    @Column(name = "email", unique = true)
    @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")
    @NotBlank(message = "Email cannot be empty!")
    private String email;

    @Column(name = "first_name")
    @NotBlank(message = "First name cannot be empty!")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Last name cannot be empty!")
    private String lastName;

    @Column
    @OneToMany
    private List<BoardModel> accessibleBoards;
}
