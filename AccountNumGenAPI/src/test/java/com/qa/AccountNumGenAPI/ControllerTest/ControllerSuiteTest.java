package com.qa.AccountNumGenAPI.ControllerTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.AccountNumGenAPI.Controller.AccNumGenController;
import com.qa.AccountNumGenAPI.Service.AccNumGenService;

@RunWith(MockitoJUnitRunner.class)
public class ControllerSuiteTest {
	private final String STRING = "test";
	@InjectMocks 
	AccNumGenController con; 
	
	@Mock 
	AccNumGenService svc;
	 
	@Test 
	public void testGetAccNum() { 
		Mockito.when(svc.generateNumber()).thenReturn(STRING); 
		assertEquals(STRING,con.getAccNum());
	} 
	
	@Test 
	public void testToString() { 
		assertEquals("AccNumGenController [svc=svc]",con.toString());
	}
}
