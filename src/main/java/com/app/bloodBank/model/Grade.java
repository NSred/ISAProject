package com.app.bloodBank.model;

public class Grade {
    private int id;
    private double gradeValue;
    private RegisteredUser registeredUser;
    private Facility facility;

    public Grade(){}

    public Grade(int id, double gradeValue, RegisteredUser registeredUser, Facility facility) {
        this.id = id;
        this.gradeValue = gradeValue;
        this.registeredUser = registeredUser;
        this.facility = facility;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public double getGradeValue() { return gradeValue; }

    public void setGradeValue(double gradeValue) { this.gradeValue = gradeValue; }

    public RegisteredUser getRegisteredUser() { return registeredUser; }

    public void setRegisteredUser(RegisteredUser registeredUser) { this.registeredUser = registeredUser; }

    public Facility getFacility() { return facility; }

    public void setFacility(Facility facility) { this.facility = facility; }
}
