package com.qa.AccountNumGenAPI.Service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class AccNumGenImpl10 implements AccNumGenService {
//	@Override
//	public String generateNumber() {
//		Random rand = new Random();
//		int letterChoice = rand.nextInt(3);
//		char[] letters = ("abc").toCharArray();
//		int accountNumber = 100000000 + rand.nextInt(900000000);
//		String response = Integer.toString(accountNumber) + Integer.toString(rand.nextInt(10));
//		return letters[letterChoice] + response;
//	} 
	@Autowired
	AccNumGen numGen;

	public String generateNumber() {
		return numGen.generateNumber(10);
	}
}
