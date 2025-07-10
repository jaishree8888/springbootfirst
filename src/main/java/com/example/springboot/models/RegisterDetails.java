package com.example.springboot.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="registerdetails")
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;
    private String empName;
    private String email;
    private String password;
    private String gender;
    private String dOB;


}
