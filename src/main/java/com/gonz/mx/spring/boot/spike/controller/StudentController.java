package com.gonz.mx.spring.boot.spike.controller;

import com.gonz.mx.spring.boot.spike.entity.Student;
import com.gonz.mx.spring.boot.spike.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(
            @PathVariable("id") int id
    ) {
        studentService.removeStudentById(id);
    }

    // The @RequestBody annotation will give us access
    // to the body of the request.
    // We need to tell Spring that this method will consume a JSON
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student newStudent) {
        studentService.updateStudent(newStudent);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student newStudent) {
        studentService.insertStudent(newStudent);
    }
}
