package com.qa.appconfig;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.qa.depinjection.Address;
import com.qa.depinjection.Profile;

@Configuration
public class AppConfig {

//	@Bean(name = "seeTime", initMethod = "init", destroyMethod = "cleanUp")
//	@Bean
//	@Lazy
//	public LocalTime seeTime() {
//		return LocalTime.now();
//	}
//	
//	@Bean
//	@Scope("prototype")
//	public String farewell() {
//		return "goodbye";
//	}
//	
//	@Bean(name = "pro1", initMethod = "init", destroyMethod = "cleanUp")
//	public Profile pro1() {
//		return new Profile("John", "Smith", "17/03/1999", "male", "British");
//	}
	
	//these would need to go in the class of that bean aka a seeTime class... see profile class for example.
//	public void init() {
//		System.out.println("Initialisation ...");	
//	}
//	
//	public void cleanUp() {
//		System.out.println("Cleaning up ...");
//	}
	
	@Bean
	@Qualifier("homeaddress")
	public Address getHomeAddress() {
		return new Address(10, "Downing Street", "London","SW1A 2AA");
	}
	
	@Bean
	@Qualifier("officeaddress")
	public Address getOfficeAddress() {
		return new Address(1, "St Katherine's Way", "London", "E1W 1YL");
	}
	
}
