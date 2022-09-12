package com.qa.appconfig;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	public LocalTime seeTime() {
		return LocalTime.now();
	}
	
	@Bean
	@Scope("prototype")
	public String farewell() {
		return "goodbye";
	}
	
}
