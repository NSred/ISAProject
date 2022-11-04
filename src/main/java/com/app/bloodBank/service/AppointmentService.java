package com.app.bloodBank.service;

import com.app.bloodBank.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AppointmentService implements IAppointmentService{
    @Override
    public Collection<Appointment> findAll() {
        return null;
    }

    @Override
    public Appointment findById(int id) {
        return null;
    }

    @Override
    public Appointment create(Appointment appointment) {
        return null;
    }
}
