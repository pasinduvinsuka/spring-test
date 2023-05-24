package com.example.spring5.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "STUDENTS")
@Getter
@Setter
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;   //instance variables
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private int age;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
}
