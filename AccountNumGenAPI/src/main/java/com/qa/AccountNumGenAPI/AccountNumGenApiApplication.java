package com.qa.AccountNumGenAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication 
@EnableWebMvc
public class AccountNumGenApiApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(AccountNumGenApiApplication.class, args);
	}

}
