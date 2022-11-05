package com.app.bloodBank.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;

public class Examination extends Appointment{
    private int equipmentAmount;
    private double price;
    private double bloodAmount;

    public Examination(){}

    public Examination(Set<FacilityAdmin> medicalStaff, LocalDateTime dateTime, int durationInMinutes, int id, RegisteredUser user, AppointmentStatus status, int equipmentAmount, double price, double bloodAmount) {

        super(medicalStaff, dateTime, durationInMinutes, id, user, status);
        this.equipmentAmount = equipmentAmount;
        this.price = price;
        this.bloodAmount = bloodAmount;
    }

    public int getEquipmentAmount() { return equipmentAmount; }

    public void setEquipmentAmount(int equipmentAmount) { this.equipmentAmount = equipmentAmount; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public double getBloodAmount() { return bloodAmount; }

    public void setBloodAmount(double bloodAmount) { this.bloodAmount = bloodAmount; }
}
