package com.xworkz.bakery.configuratin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Running : " + getClass().getSimpleName());
	}

}