package com.firstproject.vinaydemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Employee {
    @Id
    private Long empId;

    private String empName;

    private String address;


    private String jobRole;

    private String email;

    private String password;


    private long phoneNumber;


    public Employee(Long empId, String empName, String address, String jobRole, String email, String password, long phoneNumber) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.jobRole = jobRole;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee() {
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
