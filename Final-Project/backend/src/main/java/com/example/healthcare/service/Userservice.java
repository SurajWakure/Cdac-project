package com.example.healthcare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.healthcare.model.User;

public interface Userservice {

   public void addUser(User hc);
   
   public List<User> getUsers();
   
   public Optional<User> getUserById(int id);
   
   public String deleteUser(int id);
   
   
   ResponseEntity<String> authenticateUser(User hc);


}
