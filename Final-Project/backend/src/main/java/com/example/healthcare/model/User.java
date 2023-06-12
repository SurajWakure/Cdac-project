package com.example.healthcare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fullname;
	
	private String emailid;
	
	private int age;
	
	private String mobilenumber;
	
	private String username;
	
	private String password;
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructs a new User object with the specified details.
	 *
	 * @param id           The ID of the user.
	 * @param fullname     The full name of the user.
	 * @param emailid      The email ID of the user.
	 * @param age          The age of the user.
	 * @param mobilenumber The mobile number of the user.
	 * @param username     The username of the user.
	 * @param password     The password of the user.
	 */
	
	public User(int id, String fullname, String emailid, int age, String mobilenumber, String username,
			String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.emailid = emailid;
		this.age = age;
		this.mobilenumber = mobilenumber;
		this.username = username;
		this.password = password;
	}

	// Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Healthcare [id=" + id + ", fullname=" + fullname + ", emailid=" + emailid + ", age=" + age
				+ ", mobilenumber=" + mobilenumber + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
