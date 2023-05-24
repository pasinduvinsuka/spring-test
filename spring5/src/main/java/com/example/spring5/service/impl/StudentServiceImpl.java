package com.example.spring5.service.impl;

import com.example.spring5.dto.StudentDto;
import com.example.spring5.model.Students;
import com.example.spring5.repository.StudentRepository;
import com.example.spring5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudents(StudentDto studentDto){
        /*
        We need to save the data we got from the user input (via StudentDto) into the table in our database.
        So we should create a new object and save user input data into that as shown below.
         */

        Students students=new Students();
        students.setId(studentDto.getId());
        students.setName(studentDto.getName());
        students.setAge(students.getAge());
        students.setEmail(students.getEmail());
        students.setPassword(students.getPassword());
        /*
        we created new object called student,and we have set data into that.Now we have to save those data into the
        database.
         */

        studentRepository.save(students);

    }


}
