package com.xworkz.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.vaccination.dto.VaccinationDTO;
import com.xworkz.vaccination.util.MailSender;
import com.xworkz.vaccination.util.RandomOTPGenerataor;

@Controller
public class GetOtpController {
	@Autowired
	private MailSender mailSender;
//	 @Autowired
//	 private RandomOTPGenerataor randomOTPGenerataor;

	int randomOTPGenerator;

	@RequestMapping(value = "/getOtp.do")
	public String onGetOTP(@RequestParam String email, Model model) {
		randomOTPGenerator = RandomOTPGenerataor.randomOTPGenerator(1000, 9999);
		boolean sendMail = mailSender.sendMail(email, "verification otp",
				"Hii " + "your otp for vaccination " + randomOTPGenerator);
		System.out.println("otp is generted");
		return "OtpVerifier";
	}

	
	@RequestMapping(value = "/verify.do")
	public String onVerify(@RequestParam int otp, Model model) {
		System.out.println("invoked onVerify Method");
		randomOTPGenerator = otp;
		if (randomOTPGenerator==otp) {
			model.addAttribute("successfulMsg", "OTP is verified");
			return "VaccinationRegister";

		} else {
			model.addAttribute("successfulMsg", "OTP is not matched so again enter email id");
			System.out.println("otp is not valid");
			return "SignUPPage";
		}

	}
}
