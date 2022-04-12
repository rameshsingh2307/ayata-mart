package com.ayata.ayatamart.dto;

import com.ayata.ayatamart.controller.Status;

public class UserResponse {
    public Status status;
    public String token;
    public int statuscode;

    public UserResponse() {
    }

    public UserResponse(Status status, String token) {
        this.status = status;
        this.token = token;
        this.statuscode = statuscode;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
