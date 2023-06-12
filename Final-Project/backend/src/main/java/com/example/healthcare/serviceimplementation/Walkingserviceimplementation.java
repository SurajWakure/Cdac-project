package com.example.healthcare.serviceimplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.model.Walking;
import com.example.healthcare.repository.WalkingRepository;
import com.example.healthcare.service.Walkingservice;

@Service
public class Walkingserviceimplementation implements Walkingservice {

	@Autowired
	private WalkingRepository walkingrepo;
	
	/**
	 * Adds a new walking record to the repository.
	 * 
	 * @param w The walking record to be added.
	 */
	@Override
	public void add(Walking w) {
		walkingrepo.save(w);
	}

	/**
	 * Retrieves a walking record by its ID.
	 * 
	 * @param id The ID of the walking record.
	 * @return The walking record with the specified ID if found, otherwise empty.
	 */
	@Override
	public Optional<Walking> getById(int id) {
		return walkingrepo.findById(id);
	}

}
