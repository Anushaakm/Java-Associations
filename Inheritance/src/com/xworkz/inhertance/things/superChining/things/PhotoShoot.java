package com.xworkz.inhertance.things.superChining.things;

public class PhotoShoot {
	public String brand;
	public String type;
	public double price;

	public PhotoShoot() {
		System.out.println("Printing default photoshoot ");
	}

	public PhotoShoot(String brand, String type, double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
}
