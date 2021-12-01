package com.dorian.todoapi.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "boards")
@Entity
@Getter
@Setter
public class BoardModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long boardId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "created_by")
    private UserModel createdBy;

    @ManyToMany
    @JoinTable(name = "boards_users",
            joinColumns = @JoinColumn(name = "board_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<UserModel> accessors;

    @Column(name = "container_id")
    @OneToMany(mappedBy = "parentBoard", cascade = CascadeType.ALL)
    private List<TaskContainerModel> containers;

    @Column(name = "is_shared")
    private boolean shared;
}
