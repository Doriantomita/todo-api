package com.dorian.todoapi.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tasks")
@Entity
@Getter
@Setter
public class TaskModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long taskId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "task_name")
    private String name;

    @Column(name = "task_description")
    private String description;

    @ElementCollection
    @Column(name = "steps")
    private List<String> steps;

    @ElementCollection
    @Column(name = "comments")
    private List<String> comments;

    @ManyToMany
    @JoinTable(name = "tasks_users",
            inverseJoinColumns = @JoinColumn(name = "user_id"), joinColumns = @JoinColumn(name = "task_id"))
    private List<UserModel> assignedUsers;

    @ManyToOne
    private TaskContainerModel parentContainer;

    @JoinColumn(name = "color_id")
    @OneToOne
    private ColorModel color;
}
