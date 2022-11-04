package com.app.bloodBank.model;

public class FacilityComplaint {
    private int id;
    private RegisteredUser user;
    private String message;
    private String response;
    private Facility facility;

    public FacilityComplaint(){}

    public FacilityComplaint(int id, RegisteredUser user, String message, String response, Facility facility) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.response = response;
        this.facility = facility;
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

    public Facility getFacility() { return facility; }

    public void setFacility(Facility facility) { this.facility = facility; }
}
