package com.app.bloodBank.model;

public class EquipmentStorage {
    private int id;
    private int equipmentPackageAmount;
    private Facility facility;

    public EquipmentStorage(){}

    public EquipmentStorage(int id, int equipmentPackageAmount, Facility facility) {
        this.id = id;
        this.equipmentPackageAmount = equipmentPackageAmount;
        this.facility = facility;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getEquipmentPackageAmount() { return equipmentPackageAmount; }

    public void setEquipmentPackageAmount(int equipmentPackageAmount) { this.equipmentPackageAmount = equipmentPackageAmount; }

    public Facility getFacility() { return facility; }

    public void setFacility(Facility facility) { this.facility = facility; }
}
