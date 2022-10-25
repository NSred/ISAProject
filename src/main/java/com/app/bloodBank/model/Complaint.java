package com.app.bloodBank.model;

import java.util.ArrayList;
import java.util.UUID;

public class Complaint {
    private UUID id;
    private RegisteredUser user;
    private String message;
    private String response;
    //centar i osoblje

    public Complaint(){}

    public Complaint(UUID id, RegisteredUser user, String message, String response) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.response = response;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public RegisteredUser getUser() {
        return user;
    }

    public void setUser(RegisteredUser user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
