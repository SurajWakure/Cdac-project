package com.example.healthcare.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.model.Doctors;
import com.example.healthcare.repository.Doctorrepository;
import com.example.healthcare.service.Doctorservice;

@Service
public class Doctorserviceimplementation implements Doctorservice {

	@Autowired
	private Doctorrepository doctorrepository;
	
	/**
	 * Retrieves all doctors from the repository.
	 * 
	 * @return The list of all doctors.
	 */
	@Override
	public List<Doctors> getDoctors() {
		return doctorrepository.findAll();
	}

	/**
	 * Retrieves a doctor by their ID.
	 * 
	 * @param id The ID of the doctor.
	 * @return The doctor with the specified ID if found, otherwise empty.
	 */
	@Override
	public Optional<Doctors> getDoctorById(int id) {
		return doctorrepository.findById(id);
	}

	/**
	 * Adds a new doctor to the repository.
	 * 
	 * @param ds The doctor to be added.
	 * @return The added doctor.
	 */
	@Override
	public Doctors addDoctor(Doctors ds) {
		doctorrepository.save(ds);
		return ds;
	}

	/**
	 * Deletes a doctor from the repository by their ID.
	 * 
	 * @param id The ID of the doctor to be deleted.
	 */
	@Override
	public void deleteDoctor(int id) {
		doctorrepository.deleteById(id);
	}

}
