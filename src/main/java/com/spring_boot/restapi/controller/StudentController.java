package com.spring_boot.restapi.controller;

import com.spring_boot.restapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent() {
        Student student = new Student(
                1,
                "Piyapat",
                "Thongrueng"
        );
        return student;
    }

    //http://localhost:8080/students
    @GetMapping("students")
    public List<Student>getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Will", "Smiths"));
        students.add(new Student(2, "Josh", "Lucas"));
        students.add(new Student(3, "Peter", "Parker"));
        students.add(new Student(4, "Harry", "Potter"));
        students.add(new Student(5, "John", "Corner"));

        return students;
    }
}
