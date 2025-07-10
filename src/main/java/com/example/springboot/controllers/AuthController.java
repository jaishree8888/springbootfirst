package com.example.springboot.controllers;


import com.example.springboot.models.RegisterDetails;
import com.example.springboot.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;


    @GetMapping("/register")
    public String addNewUser(@RequestBody RegisterDetails registerDetails)
    {
        return authService.addNewEmployee(registerDetails);

    }

    @GetMapping("/login")
    public String Login()
    {
        return "Logged In Successfully";
    }




}
