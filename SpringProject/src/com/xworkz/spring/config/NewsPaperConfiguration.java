package com.xworkz.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.spring.thing.ParleG;

@Configuration

@ComponentScan(basePackages = "com.xworkz.spring", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {ParleGConfig.class,ParleG.class })})

public class NewsPaperConfiguration {

	@Bean
	public int paperId() {
		System.out.println("Registering id using Spring ");
		return 25;
	}

	@Bean
	public String paperName() {
		System.out.println("Registered papaer Name using Spring");
		String ref = new String("KannadaPrabha");
		return ref;
	}

	@Bean
	public String paperOwner() {
		System.out.println("Registered papaer owner Name using Spring");
		String ref = new String("Rajeev Chandrasekhar");
		return ref;
	}

	@Bean
	public String paperLanguage() {
		System.out.println("Registered papaer Language using Spring");
		String ref = new String("Kannada");
		return ref;
	}

	@Bean
	public double paperPrice() {
		System.out.println("Registered papaer price using Spring");
		// double ref = new Double(5d);
		return 5.0;
	}

}
