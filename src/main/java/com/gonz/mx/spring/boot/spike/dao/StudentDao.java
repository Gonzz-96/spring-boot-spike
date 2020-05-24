package com.gonz.mx.spring.boot.spike.dao;

import com.gonz.mx.spring.boot.spike.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// This is the data layer.
// It will maintain the connection with the data sources.
// In this case, we are using fake data.

// @Component is a very generic annotation
// Spring will inject all the dependencies.
@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Abcd", "Abcd"));
                put(2, new Student(2, "Abcd", "Abcd"));
                put(3, new Student(3, "Abcd", "Abcd"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }
}
