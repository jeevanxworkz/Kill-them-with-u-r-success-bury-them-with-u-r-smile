package com.xworkz.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="actor")
@AllArgsConstructor
public class ActorEntity {

    @Id
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "language")
    private String language;

}
