package com.qa.AccountNumGenAPI;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


import com.qa.AccountNumGenAPI.ControllerTest.ControllerSuiteTest;
import com.qa.AccountNumGenAPI.ServiceTest.AccNumGenTest;
import com.qa.AccountNumGenAPI.ServiceTest.ServiceSuiteTest;




@RunWith(Suite.class) 
@SuiteClasses({ServiceSuiteTest.class,ControllerSuiteTest.class,AccNumGenTest.class}) 
public class AccountNumGenApiApplicationTests {



}
