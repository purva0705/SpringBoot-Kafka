package com.infy.entity;

import java.util.Arrays;

public class Patient {

	private int id;
	private String timeStamp;
	private String firstName;
	private String lastName;
	private String emailId;
	private String gender;
	private String orgnization;
	private String[] address;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOrgnization() {
		return orgnization;
	}

	public void setOrgnization(String orgnization) {
		this.orgnization = orgnization;
	}

	public String[] getAddress() {
		return address;
	}

	public void setAddress(String[] address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", timeStamp=" + timeStamp + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", gender=" + gender + ", orgnization=" + orgnization + ", address="
				+ Arrays.toString(address) + "]";
	}

}
