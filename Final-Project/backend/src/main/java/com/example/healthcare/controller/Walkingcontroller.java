package com.example.healthcare.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.model.Walking;
import com.example.healthcare.service.Walkingservice;

@RestController
@RequestMapping("/walk")
@CrossOrigin
public class Walkingcontroller {

	@Autowired
	private Walkingservice walkingservice;
	
	/**
	 * Adds a new walking record.
	 * 
	 * @param walk The walking record to be added.
	 */
	public void add(@RequestBody Walking walk) {
		walkingservice.add(walk);
	}
	
	/**
	 * Retrieves a walking record by its ID.
	 * 
	 * @param id The ID of the walking record.
	 * @return The walking record with the specified ID if found, otherwise empty.
	 */
	public Optional<Walking> getWalkById(int id){
		return walkingservice.getById(id);
	}
}
