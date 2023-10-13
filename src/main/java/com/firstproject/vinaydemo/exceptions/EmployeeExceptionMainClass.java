package com.firstproject.vinaydemo.exceptions;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class EmployeeExceptionMainClass extends ResponseEntityExceptionHandler {


    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<Object> springHandleNotFound(EmployeeNotFound employeeNotFound) throws IOException {
        Error error=new Error();
        error.setCode("the entered id");
        error.setMessage("this employee is not exist in database");
        error.setErrorDetails(employeeNotFound.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}
