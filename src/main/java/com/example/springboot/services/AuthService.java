package com.example.springboot.services;

import com.example.springboot.models.RegisterDetails;
import com.example.springboot.repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthService {

    @Autowired
    RegisterDetailsRepository registerDetailsRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public String addNewEmployee(RegisterDetails registerDetails)
    {
        RegisterDetails register = new RegisterDetails();
        register.setEmpID(registerDetails.getEmpID());
        register.setEmpName(registerDetails.getEmpName());
        register.setEmail(registerDetails.getEmail());

        register.setPassword(passwordEncoder.encode(registerDetails.getPassword()+passwordEncoder));
        register.setGender(registerDetails.getGender());
        register.setDOB(registerDetails.getDOB());
        registerDetailsRepository.save(register);
        return "Employee Added Successfully";
    }

    public  String autheticate(RegisterDetails login)
    {
        RegisterDetails user = registerDetailsRepository.findByEmail(login.getEmail());
        if(user != null)
        {
            if(Objects.equals(user.getPassword(),login))
        }
    }

}
