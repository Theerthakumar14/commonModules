package com.xworkz.enroll.service;

import com.xworkz.enroll.dto.StudentEnrollDTO;

public interface StudentEnrollService {

	public boolean validateStudentEnrollDetails(StudentEnrollDTO enrollDTO);
}
