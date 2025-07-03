package com.example.springboot.controllers;


import com.example.springboot.models.Employee;
import com.example.springboot.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService hws;

    @GetMapping("/get")
    public List<Employee> getMethod()
    {
        return hws.helloWorld();
    }

    @PostMapping("/post")
    public String postMethod()
    {
        return hws.helloComputer();
    }

    @PutMapping("/put")
    public String putMethod()
    {
        return hws.helloColleagues();
    }

    @DeleteMapping("/delete")
    public String deleteMethod()
    {
        return hws.helloCoimbatore();
    }

}
