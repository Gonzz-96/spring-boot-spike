package com.gonz.mx.spring.boot.spike.service;

import com.gonz.mx.spring.boot.spike.dao.StudentDao;
import com.gonz.mx.spring.boot.spike.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

// The services will contain all the bussines layer.
// Basically, it's the domain of the application.

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }
}
