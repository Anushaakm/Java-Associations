package com.xworkz.associationExample.two;

public class City {
	public String name;
	public String state;
	public int area;
	public int population;
	
	public City(String name,String state,int area,int population) {
		this.name=name;
		this.state=state;
		this.area=area;
		this.population=population;
	}
	public void showOff()
	{
		System.out.println(name);
		System.out.println(state);
		System.out.println(area);
		System.out.println(population);
	}
	
}
