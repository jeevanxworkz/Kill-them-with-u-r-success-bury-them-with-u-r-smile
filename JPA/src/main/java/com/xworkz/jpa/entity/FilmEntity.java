package com.xworkz.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="film")
@AllArgsConstructor
@Data
public class FilmEntity {

   @Id
   @Column(name="Id")
    private int Id;

   @Column (name="movieName")
   private String movieName;

    @Column (name="actor")

    private String actor;


    @Column (name="director")
    private String director;


    @Column (name="musicdirector")
    private String musicdirector;
    
}
