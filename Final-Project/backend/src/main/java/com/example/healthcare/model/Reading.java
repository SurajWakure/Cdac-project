package com.example.healthcare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Reading {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int start;
	
	private int end;
	
	@OneToOne
	private User User;

	public Reading() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructs a new Reading object with the specified details.
	 *
	 * @param id    The ID of the reading activity.
	 * @param start The starting time of the reading activity.
	 * @param end   The ending time of the reading activity.
	 * @param user  The user associated with the reading activity.
	 */

	public Reading(int id, int start, int end, com.example.healthcare.model.User user) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		User = user;
	}
	
	//Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	@Override
	public String toString() {
		return "Walking [id=" + id + ", start=" + start + ", end=" + end + ", User=" + User + "]";
	}
	
	
}
