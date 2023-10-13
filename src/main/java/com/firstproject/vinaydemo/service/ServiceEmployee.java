package com.firstproject.vinaydemo.service;

import com.firstproject.vinaydemo.dto.Employee;
import com.firstproject.vinaydemo.response.LoginResponse;

import java.util.List;

public interface ServiceEmployee {

    List<Employee> getAllEmployees();

    Employee getEmpNum(long mobileNumber);

    String getNewEmployee(Employee employee);

    String updateEmployee(Employee employee);

    String deleteEmployee(long empId);

    Employee getEmployee(long id);


    LoginResponse authenticateUser(String email, String password);
}
