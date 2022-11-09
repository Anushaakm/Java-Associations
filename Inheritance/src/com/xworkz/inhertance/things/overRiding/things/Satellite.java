package com.xworkz.inhertance.things.overRiding.things;

public class Satellite {
	public String type;
	public double travelPerHour;

	public Satellite(String type, double travelPerHour ) {

		this.type=type;
		this.travelPerHour=travelPerHour;

	}

	public void display() {

		System.out.println(type);
		System.out.println(travelPerHour);
	}
}
