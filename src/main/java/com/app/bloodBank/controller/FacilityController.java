package com.app.bloodBank.controller;

import com.app.bloodBank.model.Facility;
import com.app.bloodBank.service.IFacilityService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/facilities")
public class FacilityController {
    private final IFacilityService facilityService;

    @Autowired
    public FacilityController(IFacilityService facilityService) {
        this.facilityService = facilityService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Facility>> findFacilities() {
        Collection<Facility> facilities = facilityService.findAll();
        return new ResponseEntity<Collection<Facility>>(facilities, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Facility>> findFacilityById(@Parameter(name="id", required = true) @PathVariable("id") Integer id) {
        Optional<Facility> facility = facilityService.findById(id);

        if (facility.isPresent()) {
            return new ResponseEntity<>(facility, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> create(@RequestBody Facility facility)  {
        try {
            facilityService.create(facility);
            return new ResponseEntity<>("Successfully created", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Not created", HttpStatus.CONFLICT);
        }
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> update(@RequestBody Facility facility)  {

        Optional<Facility> findFacility = facilityService.findById(facility.getId());

        if (findFacility.isPresent()) {
            facilityService.update(facility);
            return new ResponseEntity<>("Successfully created", HttpStatus.OK);

        }
        else{
            return new ResponseEntity<>("Facility with given id does not exist",HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@Parameter(name="id", required = true) @PathVariable("id") Integer id) {
        Optional<Facility> facility = facilityService.findById(id);

        if (facility.isPresent()) {
            facilityService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
