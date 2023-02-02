package com.xworkz.wave.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.wave")
public class SpringBeanConfig {
	public SpringBeanConfig() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

}
