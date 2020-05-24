package com.gonz.mx.spring.boot.spike.service;

import com.gonz.mx.spring.boot.spike.dao.StudentDao;
import com.gonz.mx.spring.boot.spike.entity.Student;

import java.util.Collection;

// The services will contain all the bussines layer.
// Basically, it's the domain of the application.

public class StudentService {

    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
}
