
package com.xworkz.vaccination.util;

import java.util.Random;


public class RandomOTPGenerataor {
		public static int randomOTPGenerator(int min, int max) {
			System.out.println("Random value of int from" + min + "to" + max + ":");
			int random=(int)Math.floor(Math.random()*(max-min+1)+min);
			return random;
		}
}
