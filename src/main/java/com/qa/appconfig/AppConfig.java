package com.qa.appconfig;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//	@Bean(name = "seeTime", initMethod = "init", destroyMethod = "cleanUp")
	@Bean
	@Lazy
	public LocalTime seeTime() {
		return LocalTime.now();
	}
	
	@Bean
	@Scope("prototype")
	public String farewell() {
		return "goodbye";
	}
	
	//these would need to go in the class of that bean aka a seeTime class
//	public void init() {
//		System.out.println("Initialisation ...");	
//	}
//	
//	public void cleanUp() {
//		System.out.println("Cleaning up ...");
//	}
	
}
