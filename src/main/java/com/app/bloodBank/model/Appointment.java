package com.app.bloodBank.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer id;
    private LocalDateTime dateTime;
    private int durationInMinutes;
    @ManyToOne
    private RegisteredUser user;
    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus;

    public Appointment(){}

    public Appointment(LocalDateTime dateTime, int durationInMinutes, Integer id, RegisteredUser user, AppointmentStatus status) {
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
