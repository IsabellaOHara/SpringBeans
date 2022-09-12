package com.qa.appconfig;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public LocalTime seeTime() {
		return LocalTime.now();
	}
	
}
