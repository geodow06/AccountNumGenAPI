package com.qa.AccountNumGenAPI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qa.AccountNumGenAPI.Service.AccNumGenImpl6;
import com.qa.AccountNumGenAPI.Service.AccNumGenService;


@Configuration
public class AppConfig {
	@Bean
	public AccNumGenService numGen() {
		return new AccNumGenImpl6();
	}

}
