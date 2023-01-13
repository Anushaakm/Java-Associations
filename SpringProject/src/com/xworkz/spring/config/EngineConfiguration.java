package com.xworkz.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.spring.thing.NewsPaper;
import com.xworkz.spring.thing.ParleG;

@Configuration

@ComponentScan(basePackages = "com.xworkz.spring", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { ParleGConfig.class,
				NewsPaperConfiguration.class, NewsPaper.class, ParleG.class }) })

public class EngineConfiguration {
	public EngineConfiguration() {
		System.out.println("Created Engine config using Spring ");
	}

	@Bean
	public String engineName() {
		System.out.println("Registered Engine Name using Spring");
		String ref = new String("v12 engine");
		return ref;
	}

	@Bean
	public double engineVersion() {
		System.out.println("Registered Engine version using Spring");
		double ref = new Double(7.0);
		return ref;
	}

	@Bean
	public String engineType() {
		System.out.println("Registered Engine Type using Spring");
		String ref = new String("Diesel");
		return ref;
	}

	@Bean
	public int engineNumber() {
		System.out.println("Registered Engine number using Spring");

		return 80;
	}

	@Bean
	public String engineCompany() {
		System.out.println("Registered Engine company using Spring");
		String ref = new String("Indian");
		return ref;
	}

	@Bean
	public int engineStrokes() {
		System.out.println("Registered Engine Strokesusing Spring");
		return 4;
	}

}
