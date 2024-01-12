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
@Table(name="shop")
public class ShopEntity {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="shopname")
    private String shopname;

    @Column(name="shopowner")
    private String shopowner;


    @Column(name="shoplocation")
    private String shoplocation;
}
