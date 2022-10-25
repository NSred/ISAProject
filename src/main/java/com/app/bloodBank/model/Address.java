package com.app.bloodBank.model;

import java.util.UUID;

public class Address {
    private UUID id;
    private String country;
    private String city;
    private String street;
    private String number;

    public Address(){}

    public Address(UUID id, String country, String city, String street, String number) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }
}
