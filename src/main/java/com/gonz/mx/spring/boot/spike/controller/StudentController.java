package com.gonz.mx.spring.boot.spike.controller;

import com.gonz.mx.spring.boot.spike.entity.Student;
import com.gonz.mx.spring.boot.spike.service.StudentService;

import java.util.Collection;

// The controller will attend the client requests (REST)

public class StudentController {

    private StudentService studentService;

    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
