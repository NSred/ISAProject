package com.app.bloodBank.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Appointment {
    private UUID id;
    private ArrayList<FacilityAdmin> medicalStaff;
    private LocalDateTime dateTime;
    private int durationInMinutes;
    private RegisteredUser user;

    public Appointment(){}

    public Appointment(ArrayList<FacilityAdmin> medicalStaff, LocalDateTime dateTime, int durationInMinutes, UUID id, RegisteredUser user) {
        this.medicalStaff = medicalStaff;
        this.dateTime = dateTime;
        this.durationInMinutes = durationInMinutes;
        this.id = id;
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ArrayList<FacilityAdmin> getMedicalStaff() {
        return medicalStaff;
    }

    public void setMedicalStaff(ArrayList<FacilityAdmin> medicalStaff) {
        this.medicalStaff = medicalStaff;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public RegisteredUser getUser() {
        return user;
    }

    public void setUser(RegisteredUser user) {
        this.user = user;
    }
}
