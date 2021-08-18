package com.xworkz.vaccination.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.vaccination.dao.VaccinationDAO;
import com.xworkz.vaccination.dto.VaccinationDTO;
import com.xworkz.vaccination.entity.VaccinationEntity;

@Service
public class VaccinationServiceImpl implements VaccinationService {
	@Autowired
	private VaccinationDAO vaccinationDAO;

	public VaccinationServiceImpl() {
		System.out.println("VaccinationServiceImpl object is created");
	}

	public boolean validateTheRegisterDetails(VaccinationDTO dto) {
		boolean flag = false;
		if (dto.getUserName() != null && dto.getUserName().length() > 3) {
			System.out.println("Entered name is valid");
			flag = true;
		} else {
			System.out.println("Entered name is not valid atleast name contains 3 characters");
			flag = false;
		}
		if (dto.getEmail() != null && dto.getEmail().contains("@")) {
			System.out.println("Entered email is valid");
			flag = true;
		} else {
			System.out.println("Entered email is not valid it consists of @ symbol");
			return false;
		}
		if (flag == true) {
			VaccinationEntity vaccinationEntity = new VaccinationEntity();
			BeanUtils.copyProperties(dto, vaccinationEntity);
			boolean registerDetails = this.vaccinationDAO.saveTheRegisterDetails(vaccinationEntity);
			
			return registerDetails;
		} else {
			return false;
		}

	}

}
