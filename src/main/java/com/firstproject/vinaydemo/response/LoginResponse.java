package com.firstproject.vinaydemo.response;

public class LoginResponse {
    private String Message;

    private Boolean status;

    public LoginResponse() {
    }

    public LoginResponse(String message, Boolean status) {
        Message = message;
        this.status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "Message='" + Message + '\'' +
                ", status=" + status +
                '}';
    }
}
