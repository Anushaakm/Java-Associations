package com.xworkz.anusha.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.anusha")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Running : " + getClass().getSimpleName());
	}

}