package com.xworkz.enroll.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailDispatcherToUser {
	@Autowired
	private JavaMailSender mailSender;

	public boolean sendMail(String emailId, String text, String subject) {
		System.out.println("send a mail");
		SimpleMailMessage mailMessage = new SimpleMailMessage();

		mailMessage.setTo(emailId);
		mailMessage.setText(text);
		mailMessage.setSubject(subject);

		this.mailSender.send(mailMessage);
		System.out.println("mail sending is done");
		return false;

	}

}
