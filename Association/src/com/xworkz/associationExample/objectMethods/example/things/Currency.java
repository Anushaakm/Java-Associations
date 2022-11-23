package com.xworkz.associationExample.objectMethods.example.things;

public class Currency {
	private String name;
	private double price;
	private String brand;
	private String color;
	private boolean working;
	private String ownerName;
	private int length;
	private String location;
	private double toalPrice;
	private boolean discount;

	

	public Currency(String name, double price, String brand, String color, boolean working, String ownerName,
			int length, String location, double toalPrice, boolean discount) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.working = working;
		this.ownerName = ownerName;
		this.length = length;
		this.location = location;
		this.toalPrice = toalPrice;
		this.discount = discount;
	}

	
	@Override
	public String toString() {
		return "Currency [name=" + name + ", price=" + price + ", brand=" + brand + ", color=" + color + ", working="
				+ working + ", ownerName=" + ownerName + ", length=" + length + ", location=" + location
				+ ", toalPrice=" + toalPrice + ", discount=" + discount + "]";
	}


	public boolean equals(Object object) {
		if (object instanceof Currency) {

			Currency currency = (Currency) object;
			if (this.name.equals(currency.name) && this.brand.equals(currency.brand)
					&& this.color.equals(currency.color) && this.location.equals(currency.location)
					&& this.ownerName.equals(currency.ownerName)) {
				System.out.println("equal");
				return true;
			}

			else {
				System.out.println("not equal");

			}
		}
		return false;
	}
}
