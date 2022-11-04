package com.app.bloodBank.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

public class Facility {
    private int id;
    private String name;
    private Address address;
    private String description;
    private double averageGrade;
    private LocalTime startTime;
    private LocalTime endTime;

    public Facility(){}

    public Facility(String name, Address address, String description, double averageGrade, ArrayList<FacilityAdmin> facilityAdmins, ArrayList<Appointment> freeAppointments, int id, LocalTime startTime, LocalTime endTime, BloodStorage bloodStorage) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.averageGrade = averageGrade;
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

}
