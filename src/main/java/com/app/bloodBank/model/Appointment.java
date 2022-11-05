package com.app.bloodBank.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

public class Appointment implements Serializable {
    private Integer id;
    private Set<FacilityAdmin> medicalStaff;
    private LocalDateTime dateTime;
    private int durationInMinutes;
    private RegisteredUser user;
    private AppointmentStatus appointmentStatus;

    public Appointment(){}

    public Appointment(Set<FacilityAdmin> medicalStaff, LocalDateTime dateTime, int durationInMinutes, Integer id, RegisteredUser user, AppointmentStatus status) {
        this.medicalStaff = medicalStaff;
        this.dateTime = dateTime;
        this.durationInMinutes = durationInMinutes;
        this.id = id;
        this.user = user;
        this.appointmentStatus = status;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<FacilityAdmin> getMedicalStaff() {
        return medicalStaff;
    }

    public void setMedicalStaff(Set<FacilityAdmin> medicalStaff) {
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

    public AppointmentStatus getAppointmentStatus() { return appointmentStatus; }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) { this.appointmentStatus = appointmentStatus; }
}
