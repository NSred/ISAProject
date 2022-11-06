package com.app.bloodBank.service;

import com.app.bloodBank.model.Facility;
import com.app.bloodBank.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService implements IFacilityService{
    private final FacilityRepository facilityRepository;

    @Autowired
    public FacilityService(FacilityRepository facilityRepository) {
        this.facilityRepository = facilityRepository;
    }

    public List<Facility> findAll(){
        return facilityRepository.findAll();
    }

    public Optional<Facility> findById(Integer id){ return facilityRepository.findById(id);}

    public void create(Facility facility){
        facilityRepository.save(facility);
    }

    public void delete(Integer id){
        facilityRepository.deleteById(id);
    }

    public void update(Facility facility) { facilityRepository.save(facility);}
}
