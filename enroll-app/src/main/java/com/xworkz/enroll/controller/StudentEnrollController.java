package com.xworkz.enroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.enroll.dto.StudentEnrollDTO;
import com.xworkz.enroll.service.StudentEnrollService;

@Controller
public class StudentEnrollController {

	@Autowired
	private StudentEnrollService enrollService;

	public StudentEnrollController() {
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@RequestMapping(value = "/enroll.do")
	public String onEnroll(@ModelAttribute StudentEnrollDTO studentDTO, Model model) {
		System.out.println("invoked onEnroll");
		System.out.println(studentDTO);
		boolean enrollDetails = this.enrollService.validateStudentEnrollDetails(studentDTO);
		System.out.println(enrollDetails);
		if (enrollDetails) {
			model.addAttribute("enrollMsg", "congrats you have enrolled successfully");
			return "EnrollMsg";

		} else {
			model.addAttribute("enrollMsg", "something went wrong");
			return "EnrollMsg";

		}

	}

}
