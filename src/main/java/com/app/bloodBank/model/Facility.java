package com.app.bloodBank.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

public class Facility {
    private UUID id;
    private String name;
    private Address address;
    private String description;
    private double averageGrade;
    private ArrayList<FacilityAdmin> facilityAdmins;
    private ArrayList<Appointment> freeAppointments;
    private LocalTime startTime;
    private LocalTime endTime;
    private BloodStorage bloodStorage;

    public Facility(){}

    public Facility(String name, Address address, String description, double averageGrade, ArrayList<FacilityAdmin> facilityAdmins, ArrayList<Appointment> freeAppointments, UUID id, LocalTime startTime, LocalTime endTime, BloodStorage bloodStorage) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.averageGrade = averageGrade;
        this.facilityAdmins = facilityAdmins;
        this.freeAppointments = freeAppointments;
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bloodStorage = bloodStorage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public ArrayList<FacilityAdmin> getFacilityAdmins() {
        return facilityAdmins;
    }

    public void setFacilityAdmins(ArrayList<FacilityAdmin> facilityAdmins) {
        this.facilityAdmins = facilityAdmins;
    }

    public ArrayList<Appointment> getFreeAppointments() {
        return freeAppointments;
    }

    public void setFreeAppointments(ArrayList<Appointment> freeAppointments) { this.freeAppointments = freeAppointments; }

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

    public BloodStorage getBloodStorage() { return bloodStorage; }

    public void setBloodStorage(BloodStorage bloodStorage) { this.bloodStorage = bloodStorage; }
}
