package com.spring_boot.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //HTTP GET Request
    //http://localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello world!!";
    }

}
