package com.example.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.model.Doctors;

@Repository
public interface Doctorrepository extends JpaRepository<Doctors, Integer> {

}
