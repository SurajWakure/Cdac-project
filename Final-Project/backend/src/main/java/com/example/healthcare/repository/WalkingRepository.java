package com.example.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.model.Walking;

@Repository
public interface WalkingRepository extends JpaRepository<Walking, Integer> {

}
