package com.example.springboot.models;


import lombok.Data;

@Data
public class Employee {

    private int empID;
    private String Name;
    private String Designation;

    public Employee(int empID, String name, String designation) {
        this.empID = empID;
        Name = name;
        Designation = designation;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

}
