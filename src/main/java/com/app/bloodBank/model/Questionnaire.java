package com.app.bloodBank.model;

public class Questionnaire {
    private int id;
    private RegisteredUser registeredUser;
    private boolean isUnderweight;
    private boolean hasIllnessSymptoms;
    private boolean hasSkinInfections;
    private boolean hasUnstablePressure;
    private boolean isOnTherapy;
    private boolean isInMenstrualCycle;
    private boolean hasDentalInterventions;
    private boolean hasSkinInterventions;

    public Questionnaire(){}

    public Questionnaire(int id, RegisteredUser registeredUser, boolean isUnderweight, boolean hasIllnessSymptoms, boolean hasSkinInfections, boolean hasUnstablePressure,
                         boolean isOnTherapy, boolean isInMenstrualCycle, boolean hasDentalInterventions, boolean hasSkinInterventions) {
        this.id = id;
        this.registeredUser = registeredUser;
        this.isUnderweight = isUnderweight;
        this.hasIllnessSymptoms = hasIllnessSymptoms;
        this.hasSkinInfections = hasSkinInfections;
        this.hasUnstablePressure = hasUnstablePressure;
        this.isOnTherapy = isOnTherapy;
        this.isInMenstrualCycle = isInMenstrualCycle;
        this.hasDentalInterventions = hasDentalInterventions;
        this.hasSkinInterventions = hasSkinInterventions;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public RegisteredUser getRegisteredUser() { return registeredUser; }

    public void setRegisteredUser(RegisteredUser registeredUser) { this.registeredUser = registeredUser; }

    public boolean isUnderweight() { return isUnderweight; }

    public void setUnderweight(boolean underweight) { isUnderweight = underweight; }

    public boolean isHasIllnessSymptoms() { return hasIllnessSymptoms; }

    public void setHasIllnessSymptoms(boolean hasIllnessSymptoms) { this.hasIllnessSymptoms = hasIllnessSymptoms; }

    public boolean isHasSkinInfections() { return hasSkinInfections; }

    public void setHasSkinInfections(boolean hasSkinInfections) { this.hasSkinInfections = hasSkinInfections; }

    public boolean isHasUnstablePressure() { return hasUnstablePressure; }

    public void setHasUnstablePressure(boolean hasUnstablePressure) { this.hasUnstablePressure = hasUnstablePressure; }

    public boolean isOnTherapy() { return isOnTherapy; }

    public void setOnTherapy(boolean onTherapy) { isOnTherapy = onTherapy; }

    public boolean isInMenstrualCycle() { return isInMenstrualCycle; }

    public void setInMenstrualCycle(boolean inMenstrualCycle) { isInMenstrualCycle = inMenstrualCycle; }

    public boolean isHasDentalInterventions() { return hasDentalInterventions; }

    public void setHasDentalInterventions(boolean hasDentalInterventions) { this.hasDentalInterventions = hasDentalInterventions; }

    public boolean isHasSkinInterventions() { return hasSkinInterventions; }

    public void setHasSkinInterventions(boolean hasSkinInterventions) { this.hasSkinInterventions = hasSkinInterventions; }
}
