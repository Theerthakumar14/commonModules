package com.xworkz.enroll.dto;

public class StudentEnrollDTO {

	private String userName;
	private String email;

	public StudentEnrollDTO() {
		System.out.println("Default constructor is called");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentEnrollDTO [userName=" + userName + ", email=" + email + "]";
	}

}
