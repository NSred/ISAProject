package com.app.bloodBank.controller;

import com.app.bloodBank.model.Appointment;
import com.app.bloodBank.service.AppointmentService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Tag(name = "Appointment controller", description = "The appointment API")
@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<Appointment> getAppointments() {
        Collection<Appointment> appointments = appointmentService.findAll();
        return appointments;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Appointment getAppointment(@Parameter(name="id", required = true) @PathVariable("id") int id) {
        Appointment appointment = appointmentService.findById(id);

        if (appointment == null) {
            return new Appointment();
        }

        return appointment;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Appointment createAppointment(@RequestBody Appointment appointment)  {
        Appointment savedAppointment = null;
        try {
            savedAppointment = appointmentService.create(appointment);
            return savedAppointment;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
