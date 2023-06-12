package com.example.healthcare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


import com.example.healthcare.model.User;
import com.example.healthcare.service.Userservice;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class Logincontroller {

    @Autowired
    public Userservice userservice;
    
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    /**
     * Authenticate a user
     * @param hc User object containing username and password
     * @return ResponseEntity containing the authentication status
     */
    @PostMapping("/user")
    public ResponseEntity<?> authenticateUser(@RequestBody User hc) {
        return ResponseEntity.status(200).body(userservice.authenticateUser(hc));
    }
    
}





    
    

