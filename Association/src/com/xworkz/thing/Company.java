package com.xworkz.thing;

public class Company {
	public String name;
	public String type;
	public Company(String name,String type)
	{
		System.out.println("Company's constructor");
		this.name=name;
		this.type=type;
	}
	
	public void showoff() {
		System.out.println("Company info");
		System.out.println(name);
		System.out.println(type);
	}
}
