package com.example.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.model.Reading;

@Repository
public interface Readingrepository extends JpaRepository<Reading, Integer> {

}
