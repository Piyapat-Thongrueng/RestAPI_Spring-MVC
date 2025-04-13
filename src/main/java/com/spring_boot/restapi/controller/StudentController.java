package com.spring_boot.restapi.controller;

import com.spring_boot.restapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
