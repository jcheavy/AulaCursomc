package com.jean.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jean.cursomc.services.DBService;
import com.jean.cursomc.services.EmailService;
import com.jean.cursomc.services.MockEmailService;

@Configuration
@Profile("teste")
public class TestConfig {

 
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();		
		return true;
	}
	
	@Bean 
	public EmailService emailService() {
		return new MockEmailService();
	}
}
