package com.qa.AccountNumGenAPI.Service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class AccNumGenImpl8 implements AccNumGenService {
//	@Override
//	public String generateNumber() {
//		Random rand = new Random();
//		int letterChoice = rand.nextInt(3);
//		char[] letters = ("abc").toCharArray();
//		int accountNumber = 10000000 + rand.nextInt(90000000);
//		String response = Integer.toString(accountNumber);
//		return letters[letterChoice] + response;
//	} 
	
	@Autowired 
	AccNumGen numGen;
	public String generateNumber() { 
		return numGen.generateNumber(8);
	}
}
