package com.example.healthcare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.model.Doctors;
import com.example.healthcare.service.Doctorservice;

@RestController
@CrossOrigin
@RequestMapping("/doctors")
public class Doctorcontroller {

	@Autowired
	private Doctorservice doctorservice;
	
	/**
	 * Retrieves all doctors.
	 * 
	 * @return A list of all doctors.
	 */
	@GetMapping("/getdoctors")
	public List<Doctors> getDoctors() {
		return doctorservice.getDoctors();
	}
	
	/**
	 * Retrieves a doctor by their ID.
	 * 
	 * @param id The ID of the doctor.
	 * @return The doctor with the specified ID if found, otherwise empty.
	 */
	@GetMapping("/getdoctors/{id}")
	public Optional<Doctors> getDoctorById(int id) {
		return doctorservice.getDoctorById(id);
	}
	
	/**
	 * Saves a new doctor.
	 * 
	 * @param ds The doctor object to be saved.
	 * @return The saved doctor object.
	 */
	@PostMapping("/savedoctor")
	public Doctors saveDoctor(@RequestBody Doctors ds) {
		return doctorservice.addDoctor(ds);
	}
	
	/**
	 * Deletes a doctor by their ID.
	 * 
	 * @param id The ID of the doctor to be deleted.
	 */
	@DeleteMapping("/delete")
	public void deleteDoctor(int id) {
		doctorservice.deleteDoctor(id);
	}
}
