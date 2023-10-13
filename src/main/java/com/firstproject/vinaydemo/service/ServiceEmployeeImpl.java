package com.firstproject.vinaydemo.service;

import com.firstproject.vinaydemo.dto.Employee;
import com.firstproject.vinaydemo.dto.LoginDTO;
import com.firstproject.vinaydemo.exceptions.EmployeeNotFound;
import com.firstproject.vinaydemo.repository.RepositoryEmployee;
import com.firstproject.vinaydemo.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmployeeImpl implements ServiceEmployee {

    @Autowired
    RepositoryEmployee repositoryEmployee;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public List<Employee> getAllEmployees() {
        return repositoryEmployee.findAll();
    }

    @Override
    public Employee getEmpNum(long mobileNumber) {
        return repositoryEmployee.findById(mobileNumber).get();
    }

    @Override
    public String getNewEmployee(Employee employee) {
        repositoryEmployee.save(employee);
        return "Successfully added";
    }

    @Override
    public String updateEmployee(Employee employee) {
        repositoryEmployee.save(employee);
        return "Successfully Updated";

    }

    @Override
    public String deleteEmployee(long empId) {
        repositoryEmployee.deleteById(empId);
        return "Employee is Deleted successfully";
    }

    @Override
    public Employee getEmployee(long id){

        Optional<Employee> emp = repositoryEmployee.findById(id);
        if (emp.isPresent()) {
            return emp.get();

        } else {
            throw new EmployeeNotFound("employee with "+id+" not found");

       }
        }

    @Override
    public LoginResponse authenticateUser(String email, String password) {
        Employee user = repositoryEmployee.findByEmail(email);

        if (user == null) {
            return new LoginResponse("User not found", false);
        }

        if (!user.getPassword().equals(password)) {
            return new LoginResponse("Invalid password", false);
        }

        return new LoginResponse("Login successful", true);
    }
    }



