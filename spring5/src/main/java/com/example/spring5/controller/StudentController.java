package com.example.spring5.controller;

import com.example.spring5.dto.StudentDto;
import com.example.spring5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
@CrossOrigin(origins = "*",maxAge = 3600)
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/save")
    public String saveStudents(@RequestBody StudentDto studentDto){
        studentService.saveStudents(studentDto);
        return "Student data saved successfully!";
    }
}
