package com.example.healthcare.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.model.Reading;

import com.example.healthcare.service.Readingservice;

@RestController
@CrossOrigin
@RequestMapping("/read")
public class Readingcontroller {

	@Autowired
	private Readingservice readingService;
	
	/**
	 * Adds a new reading.
	 * 
	 * @param r The reading object to be added.
	 */
	public void add(@RequestBody Reading r) {
		readingService.add(r);
	}
	
	/**
	 * Retrieves a reading by its ID.
	 * 
	 * @param id The ID of the reading.
	 * @return The reading with the specified ID if found, otherwise empty.
	 */
	public Optional<Reading> getById(int id){
		return readingService.getById(id);
	}
	
	// Additional controller methods and business logic can be added here
}
