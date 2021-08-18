package com.xworkz.vaccination.dto;

public class VaccinationDTO {
	private String userName;
	private String email;
	private int otp;
	
	
	public VaccinationDTO(String userName, String email, int otp) {
		System.out.println("VAccinationDTO object is created");
		this.userName = userName;
		this.email = email;
		this.otp = otp;
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
	
	
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "VaccinationDTO [userName=" + userName + ", email=" + email + ", otp=" + otp + "]";
	}
	
	
	
	

}
