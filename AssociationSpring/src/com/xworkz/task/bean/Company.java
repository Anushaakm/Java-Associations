package com.xworkz.task.bean;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private Location location;
	private Area area;

	public Company() {
		System.out.println("Created company....");

	}

	@Override
	public String toString() {
		return "Company [location=" + location + ", area=" + area + "]";
	}
	
	
}
