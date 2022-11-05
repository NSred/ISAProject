package com.app.bloodBank.model;


public class RegisteredUser extends User{
    private int penalties;
    private double points;
    private RegisteredUserCategory category;
    private double discount;
    private int coupons;

    public RegisteredUser(){}

    public RegisteredUser(int id, String jmbg, String name, String surname, String email, String password, Address address, String phoneNumber, Gender gender,
                          ProfessionType professionType, String professionDescription, int penalties, double points, RegisteredUserCategory category, double discount, int coupons) {
        super(id, jmbg, name, surname, email, password, address, phoneNumber, gender, professionType, professionDescription);
        this.penalties = penalties;
        this.points = points;
        this.category = category;
        this.discount = discount;
        this.coupons = coupons;
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

    public double getDiscount() { return discount; }

    public void setDiscount(double discount) { this.discount = discount; }

    public int getCoupons() { return coupons; }

    public void setCoupons(int coupons) { this.coupons = coupons; }
}
