package com.example.healthcare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Doctors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String fullname;

	private String emailid;

	private String age;

	private String mobilenumber;

	private String specialization;
	
	@ManyToOne
	private User user;

	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructs a new Doctors object with the specified details.
	 *
	 * @param id            The ID of the doctor.
	 * @param fullname      The full name of the doctor.
	 * @param emailid       The email ID of the doctor.
	 * @param age           The age of the doctor.
	 * @param mobilenumber  The mobile number of the doctor.
	 * @param specialization The specialization of the doctor.
	 * @param user          The user associated with the doctor.
	 */
	
	public Doctors(int id, String fullname, String emailid, String age, String mobilenumber, String specialization,
			User user) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.emailid = emailid;
		this.age = age;
		this.mobilenumber = mobilenumber;
		this.specialization = specialization;
		this.user = user;
	}
   
	//Getters and Setters
	
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Doctors [id=" + id + ", fullname=" + fullname + ", emailid=" + emailid + ", age=" + age
				+ ", mobilenumber=" + mobilenumber + ", specialization=" + specialization + ", user=" + user + "]";
	}

	

}
