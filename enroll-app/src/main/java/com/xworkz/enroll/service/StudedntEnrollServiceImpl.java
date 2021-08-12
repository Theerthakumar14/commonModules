package com.xworkz.enroll.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.xworkz.enroll.dao.StudentEnrollDAO;
import com.xworkz.enroll.dto.StudentEnrollDTO;
import com.xworkz.enroll.entity.StudentEnrollEntity;
import com.xworkz.enroll.util.MailDispatcherToUser;
import com.xworkz.enroll.util.RandomPasswordGenerator;

@Service
public class StudedntEnrollServiceImpl implements StudentEnrollService {
	@Autowired
	private StudentEnrollDAO studentEnrollDAO;
	@Autowired
	private MailDispatcherToUser mailDispatcher;

	public StudedntEnrollServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	public boolean validateStudentEnrollDetails(StudentEnrollDTO enrollDTO) {
		System.out.println("invoked validateStudentEnrollDetails");
		StudentEnrollEntity enrollEntity = new StudentEnrollEntity();
		String generatePassword = RandomPasswordGenerator.generatePassword(6);
		enrollEntity.setPassword(generatePassword);
		BeanUtils.copyProperties(enrollDTO, enrollEntity);
		boolean details = this.studentEnrollDAO.saveStudentDetails(enrollEntity);
		System.out.println("In serviceimpl" + "");
		if (details) {
			mailDispatcher.sendMail(enrollDTO.getEmail(), "confiramation for enroll", "Thank u for enrolling"
					+ enrollDTO.getUserName() + "pls use this password for login " + generatePassword);
			return true;
		} else {
			System.out.println("something wrong");
		}

		return false;
	}

}
