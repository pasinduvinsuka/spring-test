package com.example.spring5.service;

import com.example.spring5.dto.StudentDto;

public interface StudentService {
    void saveStudents(StudentDto studentDto);
    /*
    We take data which user gave to us.We handle those stuffs in studentDto.So we need to take the data from
    StudentDto and save them into the database.So we are passing an  argument (StudentDto studentDto).
     */

    /*
    by defaults methods under an interface are "public" and "abstract".As long as it is an abstract method,
    it cannot have a method body.So we need to  implement this method with a class and override the methods
    that don't have a body.
     */
}
