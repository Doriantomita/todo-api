package com.dorian.todoapi.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "colors")
@Entity
@Getter
@Setter
public class ColorModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long colorId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "hex_value")
    private String hexValue;
}
