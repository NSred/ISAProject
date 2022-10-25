package com.app.bloodBank.model;

import java.util.UUID;

public class Examination {
    private UUID id;
    private int equipmentAmount;
    private int weightInKg;
    private boolean isAbleToDonate;
    private RegisteredUser user;

    public Examination(){}

    public Examination(UUID id, int equipmentAmount, int weightInKg, boolean isAbleToDonate, RegisteredUser user) {
        this.id = id;
        this.equipmentAmount = equipmentAmount;
        this.weightInKg = weightInKg;
        this.isAbleToDonate = isAbleToDonate;
        this.user = user;
    }

    public UUID getId() { return id; }

    public void setId(UUID id) { this.id = id; }

    public int getEquipmentAmount() { return equipmentAmount; }

    public void setEquipmentAmount(int equipmentAmount) { this.equipmentAmount = equipmentAmount; }

    public int getWeightInKg() { return weightInKg; }

    public void setWeightInKg(int weightInKg) { this.weightInKg = weightInKg; }

    public boolean isAbleToDonate() { return isAbleToDonate; }

    public void setAbleToDonate(boolean ableToDonate) { isAbleToDonate = ableToDonate; }

    public RegisteredUser getUser() { return user; }

    public void setUser(RegisteredUser user) { this.user = user; }
}
