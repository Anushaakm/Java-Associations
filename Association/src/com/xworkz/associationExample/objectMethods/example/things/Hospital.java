package com.xworkz.associationExample.objectMethods.example.things;

public class Hospital {
	private String name;
	private double price;
	private String rating;
	private String color;
	private boolean working;
	private String ownerName;
	private int noOfDoc;
	private String location;
	private double docCharge;
	private boolean discount;

	

	public Hospital(String name, double price, String rating, String color, boolean working, String ownerName,
			int noOfDoc, String location, double docCharge, boolean discount) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.color = color;
		this.working = working;
		this.ownerName = ownerName;
		this.noOfDoc = noOfDoc;
		this.location = location;
		this.docCharge = docCharge;
		this.discount = discount;
	}

	
	@Override
	public String toString() {
		return "Currency [name=" + name + ", price=" + price + ", brand=" + rating + ", color=" + color + ", working="
				+ working + ", ownerName=" + ownerName + ", noOfDoc=" + noOfDoc + ", location=" + location
				+ ", toalPrice=" + docCharge + ", discount=" + discount + "]";
	}


	public boolean equals(Object object) {
		if (object instanceof Hospital) {

			Hospital hospital = (Hospital) object;
			if (this.name.equals(hospital.name) && this.rating==(hospital.rating)
					&& this.color.equals(hospital.color) && this.location.equals(hospital.location)
					&& this.ownerName.equals(hospital.ownerName)) {
				System.out.println("equal");
				return true;
			}
		}
			else {
				System.out.println("not equal");

			}
		
		return false;
	}
}
