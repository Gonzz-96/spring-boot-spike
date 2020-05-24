package com.gonz.mx.spring.boot.spike.controller;

import com.gonz.mx.spring.boot.spike.entity.Student;
import com.gonz.mx.spring.boot.spike.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

// The controller will attend the client requests (REST)
// The @RequestMapping annotation will define
// the endpoint of the controller.

// The endpoint can also be defined at a method level,
// but in this case it's not needed since we are defining
// the endpoint at a class level.

// Something like:
// @RequestMapping(value = "/endpoint", method = RequestMethod.GET)
// public Collection<Student> getAllStudents() ...

// The class endpoint will concatenate with method endpoints

@RestController
@RequestMapping("/students") // URL
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(
            @PathVariable("id") int id
    ) {
        return studentService.getStudentById(id);
    }
}
