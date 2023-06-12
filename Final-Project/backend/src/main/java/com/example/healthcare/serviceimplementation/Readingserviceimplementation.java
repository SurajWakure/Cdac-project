package com.example.healthcare.serviceimplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.model.Reading;
import com.example.healthcare.repository.Readingrepository;
import com.example.healthcare.service.Readingservice;

@Service
public class Readingserviceimplementation implements Readingservice {

	@Autowired
	private Readingrepository readinrepo;
	
	/**
	 * Adds a new reading to the repository.
	 * 
	 * @param r The reading to be added.
	 */
	@Override
	public void add(Reading r) {
		readinrepo.save(r);
	}

	/**
	 * Retrieves a reading by its ID.
	 * 
	 * @param id The ID of the reading.
	 * @return The reading with the specified ID if found, otherwise empty.
	 */
	@Override
	public Optional<Reading> getById(int id) {
		return readinrepo.findById(id);
	}

}
