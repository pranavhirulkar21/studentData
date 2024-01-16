package com.pranav.pojo;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(name = "firstname",length=30)
    private String firstName;
	@Column(name = "lastname",length=30)
    private String lastName;
	@Column(name = "gender",length=30)
    private String gender;
	@Column(name = "email",length=50)
    private String email;
	@Column(name = "phonenumber",length=15)
    private String phoneNumber;
    
   
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
    
}
