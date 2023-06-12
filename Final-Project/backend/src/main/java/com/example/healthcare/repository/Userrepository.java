package com.example.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.model.User;

@Repository
public interface Userrepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
