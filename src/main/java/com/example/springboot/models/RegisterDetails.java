package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_details")
public class RegisterDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name = "emp_name", nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    private String gender;

    public Date getDob() {
        return dob;
    }

    @Column(name = "Date_Of_Birth")
    private Date dob;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob(Date dob) {
        return this.dob;
    }
    @Column(name = "user_name",nullable = false,unique = true)
    private String userName;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name="user_roles",joinColumns =
    @JoinColumn(name ="user_id",referencedColumnName ="empId"),
            inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "roleId")
    )
    private Set<Roles> roles;

    public void setDob(Date dob) {
        this.dob = dob;
    }
}