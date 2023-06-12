package com.example.healthcare.service;

import java.util.Optional;

import com.example.healthcare.model.Walking;

public interface Walkingservice {

	public void add(Walking w);
	
	public Optional<Walking> getById(int id);
}
