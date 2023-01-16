package com.xworkz.spring.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.spring.thing.Engine;
import com.xworkz.spring.thing.NewsPaper;
import com.xworkz.spring.thing.ParleG;
import com.xworkz.spring.thing.Snake;
@Configuration

@ComponentScan(basePackages = "com.xworkz.spring", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { ParleGConfig.class,
				NewsPaperConfiguration.class, NewsPaper.class, ParleG.class, EngineConfiguration.class,
				Engine.class,SnakeConfiguration.class,Snake.class }) })

public class GhostConfiguration {
	// Creating beans for Ghost class

	@Bean
	public String ghostName() {
		return "ABC";
	}

	@Bean
	public String ghostLastName() {
		return "ALIAS DEF";
	}

	@Bean
	public int ghostAge() {
		return 25;
	}

	@Bean
	public LocalDate deathDate() {
		return LocalDate.of(2010, 03, 21);
	}

	@Bean
	public String ghostLocation() {
		return "Bengaluru";
	}

	@Bean
	public boolean isScary() {
		return true;
	}

	@Bean
	public String ghostFriendName() {
		return "Ganga";
	}

	@Bean
	public String ghostFavFood() {
		return "Biriyani";
	}

	@Bean
	public String ghostFavSports() {
		return "Kho-kho";
	}

	@Bean
	public String gender() {
		return "Female";
	}

	@Bean
	public String ghostFullName() {
		return "Naagavalli SM";
	}

	@Bean
	public int since() {
		return 1980;
	}

	@Bean
	public boolean hasLover() {
		return true;
	}

	@Bean
	public int numberOfLegs() {
		return 2;
	}

	@Bean
	public boolean isSucide() {
		return false;
	}

	@Bean
	public boolean bad() {
		return false;
	}

	@Bean
	public boolean good() {
		return true;
	}

	@Bean
	public double weight() {
		return 75;
	}

	@Bean
	public boolean thin() {
		return false;
	}

	@Bean
	public boolean fat() {
		return true;
	}

}
