package com.dorian.todoapi.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    private Long userId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @ManyToMany
    @JoinTable(name = "tasks_users",
            joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "task_id"))
    private List<TaskModel> assignedTasks;

    @ManyToMany
    @JoinTable(name = "boards_users",
            inverseJoinColumns = @JoinColumn(name = "board_id"), joinColumns = @JoinColumn(name = "user_id"))
    private List<BoardModel> accessibleBoards;
}
