package com.example.springboot.services;

import com.example.springboot.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    List<Employee> emp = new ArrayList<>(
            Arrays.asList(new Employee(1,"Prasanth","Trainer"),
                    new Employee(2,"Yuvaraj","Staff")
            )
    );

    public List<Employee> helloWorld()
    {
        return emp;
    }

    public String helloComputer()
    {
        return"helloComputer";
    }

    public String helloColleagues()
    {
        return"helloColleagues";
    }

    public String helloCoimbatore()
    {
        return"helloCoimbatore";
    }
}
