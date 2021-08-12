package com.xworkz.enroll.util;

import java.security.SecureRandom;
import java.util.Random;

public class RandomPasswordGenerator {
	public static String generatePassword(int length) {

		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabccdefghijklmnopqrstuuvwxys0123456789";
		SecureRandom secureRandom = new SecureRandom();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int randonmIndex = secureRandom.nextInt(chars.length());
			builder.append(chars.charAt(randonmIndex));
		}
		return builder.toString();

	}
}
