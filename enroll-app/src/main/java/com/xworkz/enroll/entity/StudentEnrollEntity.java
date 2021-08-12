package com.xworkz.enroll.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_enroll")

public class StudentEnrollEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ENROLL_ID")
	private int enrollId;

	@Column(name = "ENROLL_NAME")
	private String userName;

	@Column(name = "ENROLL_EMAIL")
	private String email;

	@Column(name = "ENROLL_PASSWORD")
	private String password;

	public StudentEnrollEntity() {
		System.out.println("default constructor is called through entity");
	}

	public int getEnrollId() {
		return enrollId;
	}

	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "StudentEnrollEntity [enrollId=" + enrollId + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + "]";
	}

}
