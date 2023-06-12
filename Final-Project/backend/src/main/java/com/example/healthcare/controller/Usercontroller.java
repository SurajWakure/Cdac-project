package com.example.healthcare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.example.healthcare.model.User;
import com.example.healthcare.service.Userservice;

@RestController
@CrossOrigin
@RequestMapping("/healthcare")
public class Usercontroller {

    @Autowired
    private Userservice userservice;
    
    // Password encoder for encrypting user passwords
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    /**
     * Get all users
     * @return List of users
     */
    @GetMapping("/getuser")
    public List<User> getUser() {
        return userservice.getUsers();
    }

    /**
     * Get a user by ID
     * @param id User ID
     * @return Optional containing the user if found, otherwise empty
     */
    @GetMapping("/getuser/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return userservice.getUserById(id);
    }

    /**
     * Add a new user
     * @param hc User object to be added
     * @return Added user object
     */
    @PostMapping("/saveuser")
    public void addUser(@RequestBody User hc) {
        
        // Save the user using the service
        userservice.addUser(hc);
       
    }
}
