package com.xworkz.associationExample.two;

public class Country {
	public String name;
	public int code;
	public String capital;
	public int noOfStates;
	
	public Country(String name, int code, String capital, int noOfStates) {
		this.capital=capital;
		this.code=code;
		this.name=name;
		this.noOfStates=noOfStates;	
	}
	
	public void showOff()
	{
		System.out.println(capital);
		System.out.println(code);
		System.out.println(name);
		System.out.println(noOfStates);
	}
	
}
