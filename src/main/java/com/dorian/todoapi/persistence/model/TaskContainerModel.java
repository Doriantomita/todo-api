package com.dorian.todoapi.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task_containers")
@Entity
@Getter
@Setter
public class TaskContainerModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long containerId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "task_name")
    private String name;

    @OneToMany(mappedBy = "parentContainer")
    @JoinColumn(name = "tasks", referencedColumnName = "id")
    private List<TaskModel> tasks;

    @Column(name = "parent_board")
    @ManyToOne
    private BoardModel parentBoard;
}
