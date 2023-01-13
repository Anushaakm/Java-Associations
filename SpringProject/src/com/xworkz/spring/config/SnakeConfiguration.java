package com.xworkz.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.spring.thing.Engine;
import com.xworkz.spring.thing.NewsPaper;
import com.xworkz.spring.thing.ParleG;

@Configuration

@ComponentScan(basePackages = "com.xworkz.spring", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { ParleGConfig.class,
				NewsPaperConfiguration.class, NewsPaper.class, ParleG.class, EngineConfiguration.class,
				Engine.class }) })

public class SnakeConfiguration {
	public SnakeConfiguration() {
		System.out.println("Snake configuration created");
	}

	@Bean
	public String snakeName() {
		System.out.println("Registered Snake Name using Spring");
		String ref = new String("Boomslang");
		return ref;
	}

	@Bean
	public double snakeLength() {
		System.out.println("Registered Snake Length using Spring");
		double ref = new Double(10.0);
		return ref;
	}

	@Bean
	public String snakeColor() {
		System.out.println("Registered Snake Color using Spring");
		String ref = new String("Green");
		return ref;
	}

	@Bean
	public String snakeType() {
		System.out.println("Registered Snake Type using Spring");
		String ref = new String("Venomous");
		return ref;
	}

	@Bean
	public boolean snakePoisonous() {
		System.out.println("Registered Snake using spring");

		return true;
	}

}
