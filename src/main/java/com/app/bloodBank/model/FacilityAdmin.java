package com.app.bloodBank.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class FacilityAdmin extends User implements Serializable {
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Appointment appointment;

    public FacilityAdmin(){}

    public FacilityAdmin(int id, String jmbg, String name, String surname, String email, String password, Address address, String phoneNumber, Gender gender, ProfessionType professionType, String professionDescription, Facility facility, Appointment appointment) {
        super(id, jmbg, name, surname, email, password, address, phoneNumber, gender, professionType, professionDescription);
        this.facility = facility;
        this.appointment = appointment;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
