package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "ENTITIES")
@Data
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
}
