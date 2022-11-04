package com.app.bloodBank.model;

public class BloodStorage {
    private int id;
    private double amountInLiters;
    private BloodType bloodType;
    private Facility facility;

    public BloodStorage(){}

    public BloodStorage(int id, double amountInLiters, BloodType bloodType, Facility facility) {
        this.id = id;
        this.amountInLiters = amountInLiters;
        this.bloodType = bloodType;
        this.facility = facility;
    }
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

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
