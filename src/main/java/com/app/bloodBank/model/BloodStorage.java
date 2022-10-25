package com.app.bloodBank.model;

public class BloodStorage {
    private double amountInLiters;
    private BloodType bloodType;
    private Facility facility;

    public BloodStorage(){}

    public BloodStorage(double amountInLiters, BloodType bloodType, Facility facility) {
        this.amountInLiters = amountInLiters;
        this.bloodType = bloodType;
        this.facility = facility;
    }

    public double getAmountInLiters() {
        return amountInLiters;
    }

    public void setAmountInLiters(double amountInLiters) {
        this.amountInLiters = amountInLiters;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}
