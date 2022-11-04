package com.app.bloodBank.model;

import java.util.UUID;

public class StaffComplaint {
    private int id;
    private RegisteredUser user;
    private String message;
    private String response;
    private FacilityAdmin facilityAdmin;
    public StaffComplaint(){}

    public StaffComplaint(int id, RegisteredUser user, String message, String response, FacilityAdmin facilityAdmin) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.response = response;
        this.facilityAdmin = facilityAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public FacilityAdmin getFacilityAdmin() { return facilityAdmin; }

    public void setFacilityAdmin(FacilityAdmin facilityAdmin) { this.facilityAdmin = facilityAdmin; }
}
