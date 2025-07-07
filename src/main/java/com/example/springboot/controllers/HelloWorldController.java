package com.example.springboot.controllers;

import com.example.springboot.models.Employee;
import com.example.springboot.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class HelloWorldController {

    @Autowired
    private HelloWorldService hws;

    @PostMapping
    public String addEmployee(@RequestBody Employee e) {
        hws.addEmployee(e);
        return "Employee Added Successfully";
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return hws.getAllEmployees();
    }

    @GetMapping("/{eid}")
    public Employee getEmployeeById(@PathVariable int eid) {
        return hws.getEmployeeById(eid);
    }

    @DeleteMapping("/{eid}")
    public String deleteEmployee(@PathVariable int eid) {
        return hws.deleteEmployeeById(eid);
    }

    @PutMapping("/{eid}")
    public String updateRecord(@RequestBody Employee employee) {
        return hws.updateRecord(employee);
    }
}
