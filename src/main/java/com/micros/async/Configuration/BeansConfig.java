package com.micros.async.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.micros.async.service.SendEmailService;

@Configuration
public class BeansConfig {

@Bean
public SendEmailService sendemailservice() {
	return new SendEmailService();
}	
	
	public BeansConfig() {
		// TODO Auto-generated constructor stub
	}

}
