package com.qa;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeansApplication.class, args);
		
		Object byName = context.getBean("seeTime");
		LocalTime byType = context.getBean(LocalTime.class);
		LocalTime byBoth = context.getBean("seeTime", LocalTime.class);
		
		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);
		
		String bye = context.getBean("farewell",String.class);
		System.out.println(bye);
		
		
	}

}
