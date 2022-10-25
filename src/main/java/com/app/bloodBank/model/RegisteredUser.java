package com.app.bloodBank.model;

import java.util.UUID;

public class RegisteredUser extends User{
    private int penalties;
    private double points;
    private RegisteredUserCategory category;
    //popusti i kuponi, qr kodovi zakazanih termina

    public RegisteredUser(){}

    public RegisteredUser(UUID id, String jmbg, String name, String surname, String email, String password, Address address, String phoneNumber, Gender gender, ProfessionType professionType, String professionDescription, UserRole userRole, int penalties, double points, RegisteredUserCategory category) {
        super(id, jmbg, name, surname, email, password, address, phoneNumber, gender, professionType, professionDescription, userRole);
        this.penalties = penalties;
        this.points = points;
        this.category = category;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public RegisteredUserCategory getCategory() {
        return category;
    }

    public void setCategory(RegisteredUserCategory category) {
        this.category = category;
    }
}
