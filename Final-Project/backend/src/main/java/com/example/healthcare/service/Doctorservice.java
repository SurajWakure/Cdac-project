package com.example.healthcare.service;

import java.util.List;
import java.util.Optional;

import com.example.healthcare.model.Doctors;

public interface Doctorservice {

	public List<Doctors> getDoctors();
	
	public Optional<Doctors> getDoctorById(int id);
	
	public Doctors addDoctor(Doctors ds);
	
	public void deleteDoctor(int id);
}
