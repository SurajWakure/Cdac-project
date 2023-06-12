package com.example.healthcare.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.healthcare.model.User;
import com.example.healthcare.repository.Userrepository;
import com.example.healthcare.service.Userservice;

import jakarta.persistence.EntityManager;

@Service
public class Userserviceimplementation implements Userservice {

    @Autowired
    private Userrepository userrepository;
    

    @Autowired
    private PasswordEncoder passwordEncoder;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    /**
     * Add a new user
     * @param hc User object to be added
     * @return Added user object
     */
    @Override
    public void addUser(User hc) {
        hc.setPassword(passwordEncoder.encode(hc.getPassword()));
        userrepository.save(hc);
        
    }

    /**
     * Get all users
     * @return List of users
     */
    @Override
    public List<User> getUsers() {
        return userrepository.findAll();
    }

    /**
     * Get a user by ID
     * @param id User ID
     * @return Optional containing the user if found, otherwise empty
     */
    @Override
    public Optional<User> getUserById(int id) {
        return userrepository.findById(id);
    }

    /**
     * Delete a user by ID
     * @param id User ID to be deleted
     * @return Deletion status message
     */
    @Override
    public String deleteUser(int id) {
        // TODO: Implement user deletion logic
        return null;
    }

    /**
     * Authenticate a user by username and password
     * @param hc User object containing username and password
     * @return Response entity with authentication status message
     */

    @Override
	public ResponseEntity<String> authenticateUser(User hc) {
		try {
			Optional<User> opUser = Optional.ofNullable(userrepository.findByUsername(hc.getUsername()));
			if (opUser.isPresent()) {
				User dbuser = opUser.get();
				
				if (bCryptPasswordEncoder.matches(hc.getPassword(), dbuser.getPassword())) {
					return ResponseEntity.status(HttpStatus.OK).body("Successfully Logged In.");}
//					return ResponseEntity.ok("Successfully Logged In.");
				else {
//					return ResponseEntity.ok("Wrong Password. Please try again!");
					return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong Password. Please try again!");}
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer is not registered yet.");
//			return ResponseEntity.ok("Customer is not registered yet.");
		} catch (Exception e) {
			// Handle the exception here or log it for troubleshooting
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred during authentication.");
		}
	}
    

}

