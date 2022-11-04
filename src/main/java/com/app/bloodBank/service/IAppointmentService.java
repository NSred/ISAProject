package com.app.bloodBank.service;

import com.app.bloodBank.model.Appointment;

import java.util.Collection;

public interface IAppointmentService {
    Collection<Appointment> findAll();
    Appointment findById(int id);
    Appointment create(Appointment appointment);
}
