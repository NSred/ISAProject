package com.app.bloodBank.model;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class SystemAdmin extends User implements Serializable {

    public SystemAdmin(){}

    public SystemAdmin(Integer id, String jmbg, String name, String surname, String email, String password, Address address, String phoneNumber, Gender gender, ProfessionType professionType, String professionDescription) {
        super(id, jmbg, name, surname, email, password, address, phoneNumber, gender, professionType, professionDescription);
    }

}
