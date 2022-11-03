package com.xworkz.associationExample.two;

public class Company {
	public String name;
	public String ownerName;
	public Location location;
	
	public Company(String name,String ownerName,Location location) {
		this.location=location;
		this.name=name;
		this.ownerName=ownerName;
	}
	
	public void showOff() {
		System.out.println(name);
		System.out.println(ownerName);
		
		if(location!=null) {
		this.location.showOff();
	}
		else {
			System.out.println("location is null");
		}
	}
}
