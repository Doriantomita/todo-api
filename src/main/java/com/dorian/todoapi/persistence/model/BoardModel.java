package com.dorian.todoapi.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "boards")
@Entity
@Getter
@Setter
public class BoardModel {

    @Id
    private Long id;
}
