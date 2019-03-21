package com.qa.AccountNumGenAPI.ServiceTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.AccountNumGenAPI.Service.AccNumGen;


//@RunWith(MockitoJUnitRunner.class) 
@RunWith(SpringRunner.class)
@SpringBootTest(classes=AccNumGen.class)
public class AccNumGenTest {
	
	@Autowired
	AccNumGen numGen;
	
	@Test 
	public void generate6Test() { 
		String response = numGen.generateNumber(6); 
		System.out.println(response.length());
		assertTrue(response.length()==7); 
		System.out.println(response);
	} 
	
	@Test 
	public void generate8Test() { 
		String response = numGen.generateNumber(8); 
		System.out.println(response.length());
		assertTrue(response.length()==9); 
		System.out.println(response);
	} 
	
	@Test 
	public void generate10Test() { 
		String response = numGen.generateNumber(10); 
		System.out.println(response.length());
		assertTrue(response.length()==11); 
		System.out.println(response);
	}
	
}
