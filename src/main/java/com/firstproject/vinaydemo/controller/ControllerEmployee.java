package com.firstproject.vinaydemo.controller;
import com.firstproject.vinaydemo.dto.Employee;
import com.firstproject.vinaydemo.dto.LoginDTO;
import com.firstproject.vinaydemo.response.LoginResponse;
import com.firstproject.vinaydemo.service.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/app")
public class ControllerEmployee {

    @Autowired
    ServiceEmployee serviceEmployee;

    //    Logger logger
//            = LoggerFactory.getLogger(ControllerEmployee.class);
//
    @GetMapping("/list")
    public List<Employee> getAllEmployees() {

        return serviceEmployee.getAllEmployees();
    }
    @GetMapping("/eid/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable long id) {
        Employee emp1=serviceEmployee.getEmployee(id);
        return ResponseEntity.ok(emp1);
    }

    @GetMapping("/number/{mobileNumber}")
    public Employee getEmpNum(@PathVariable long mobileNumber) {
        return serviceEmployee.getEmpNum(mobileNumber);
    }

    @PostMapping
    public String getNewEmployee(@RequestBody Employee employee) {
        serviceEmployee.getNewEmployee(employee);
        return "Employee is created successfully";
    }
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginDTO loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        LoginResponse loginResponse =  serviceEmployee.authenticateUser(email, password);

        if (loginResponse.getStatus()) {
            return ResponseEntity.ok(loginResponse);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(loginResponse);
        }
    }



    @PutMapping("/{id}")
    public String updateEmployee(@RequestBody Employee employee) {
        serviceEmployee.updateEmployee(employee);
        return "Employee is updated Successfully";
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployee(@PathVariable long empId) {
        serviceEmployee.deleteEmployee(empId);
        return "employee is deleted Successfully";
    }


}
