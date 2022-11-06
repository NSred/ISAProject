package com.app.bloodBank.service;

import com.app.bloodBank.model.Facility;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    List<Facility> findAll();
    Optional<Facility> findById(Integer id);
    void create(Facility facility);
    void delete(Integer id);
    void update(Facility facility);
}
