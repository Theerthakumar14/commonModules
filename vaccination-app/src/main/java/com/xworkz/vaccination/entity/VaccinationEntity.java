package com.xworkz.vaccination.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccinationreg_table")
public class VaccinationEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="REGISTER_ID")
	private int id;
	
	@Column(name="REGISTER_NAME")
	private String userName;
	
	@Column(name="REGISTER_MAIL")
	private String email;
	
	public VaccinationEntity() {
		System.out.println("VaccinationEntity object is created");
	}

	public VaccinationEntity(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "VaccinationEntity [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
	

}
