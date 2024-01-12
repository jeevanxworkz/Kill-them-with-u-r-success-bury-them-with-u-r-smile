package com.xworkz.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@Table(name="festival")
public class FestivalEntity {


    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="month")
    private String month;

    @Column(name="season")
    private String season;
}
