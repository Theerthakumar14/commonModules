package com.xworkz.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.vaccination.dto.VaccinationDTO;
import com.xworkz.vaccination.service.VaccinationService;

@Controller
public class VaccinationController {
	@Autowired
	private VaccinationService VaccineService;

	public VaccinationController() {
		System.out.println("VaccinationController object is created");
	}

	@RequestMapping(value = "/register.do")
	public String onRegister(@ModelAttribute VaccinationDTO vaccinedto, Model model) {
		System.out.println("invoked onRegister");
		System.out.println(vaccinedto);
		boolean validatedTheResult = this.VaccineService.validateTheRegisterDetails(vaccinedto);
		if (validatedTheResult) {
			model.addAttribute("RegisteredMsg", "You are Successfully registered Thank you!");
			return "RegisterMsg";
		} else {
			model.addAttribute("RegisteredMsg", "Someting went wrong please try again");
			return "VaccinationRegister";
		}
	}

}
