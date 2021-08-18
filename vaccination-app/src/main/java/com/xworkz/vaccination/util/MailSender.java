package com.xworkz.vaccination.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailSender {
	@Autowired
	private JavaMailSender mailSender;

	public boolean sendMail(String email, String text, String subject) {
		System.out.println("send a mail");
		SimpleMailMessage mailMessage = new SimpleMailMessage();

		mailMessage.setTo(email);
		mailMessage.setText(text);
		mailMessage.setSubject(subject);
		
		this.mailSender.send(mailMessage);
		System.out.println("mail sending is done");
		return false;

	}

}
