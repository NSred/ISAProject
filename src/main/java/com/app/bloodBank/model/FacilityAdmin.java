package com.app.bloodBank.model;

import java.util.ArrayList;
import java.util.UUID;

public class FacilityAdmin extends User{
    private Facility facility;
    private ArrayList<Appointment> appointments;

    public FacilityAdmin(){}

    public FacilityAdmin(int id, String jmbg, String name, String surname, String email, String password, Address address, String phoneNumber, Gender gender, ProfessionType professionType, String professionDescription, Facility facility, ArrayList<Appointment> appointments) {
        super(id, jmbg, name, surname, email, password, address, phoneNumber, gender, professionType, professionDescription);
        this.facility = facility;
        this.appointments = appointments;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }
}
