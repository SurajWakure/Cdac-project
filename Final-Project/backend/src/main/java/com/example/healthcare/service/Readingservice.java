package com.example.healthcare.service;

import java.util.Optional;

import com.example.healthcare.model.Reading;

public interface Readingservice {

	public void add(Reading r);

	public Optional<Reading> getById(int id);
}
