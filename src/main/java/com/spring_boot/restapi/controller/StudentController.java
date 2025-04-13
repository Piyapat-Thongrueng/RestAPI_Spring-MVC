package com.spring_boot.restapi.controller;

import com.spring_boot.restapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    // Spring BOOT REST API with Path Variable
    // {id} - URI template variable
    // http://localhost:8080/students/1/piyapat/thongrueng

    @GetMapping("students/{id}/{first-name}/{last-name}") // naming convention using "-"
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName) {
        return new Student(studentId, firstName, lastName);
    }

    // Spring BOOT REST API with Request Param
    // http://localhost:8080/students/query?id=1&firstName=Jabby&lastName=Helloworld

    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName) {
        return new Student(id, firstName, lastName);
    }

    // Spring boot REST API that handles HTTP POST Request
    // @PostMapping and @RequestBody

    @PostMapping("students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }
}
