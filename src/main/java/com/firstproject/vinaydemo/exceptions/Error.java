package com.firstproject.vinaydemo.exceptions;

public class Error {
    private String code;

    private String Message;

    private String errorDetails;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    @Override
    public String toString() {
        return "Error{" +
                "code='" + code + '\'' +
                ", Message='" + Message + '\'' +
                ", errorDetails='" + errorDetails + '\'' +
                '}';
    }
}
