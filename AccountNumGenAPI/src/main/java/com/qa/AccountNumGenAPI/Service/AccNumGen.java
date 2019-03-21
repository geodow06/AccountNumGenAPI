package com.qa.AccountNumGenAPI.Service;

import java.util.Random;

public class AccNumGen {

	public String generateNumber(int digits) {
		Random rand = new Random();
		int letterChoice = rand.nextInt(3);
		char[] letters = ("abc").toCharArray();
		int accountNumber = 0;
		String response = "";
		switch (digits) {
		case 6:
			accountNumber = 100000 + rand.nextInt(900000);
			response = Integer.toString(accountNumber);
			break;
		case 8:
			accountNumber = 10000000 + rand.nextInt(90000000);
			response = Integer.toString(accountNumber);
			break;
		case 10:
			accountNumber = 100000000 + rand.nextInt(900000000);
			response = Integer.toString(accountNumber) + Integer.toString(rand.nextInt(digits));
			break; 
		default :  
			
			break;
		}

		return letters[letterChoice] + response;
	}
}
