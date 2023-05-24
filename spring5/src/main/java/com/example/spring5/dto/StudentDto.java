package com.example.spring5.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
    private int id;
    private String name;
    private String email;
    private String password;
    private int age;
}
