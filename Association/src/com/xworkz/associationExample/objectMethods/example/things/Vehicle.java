package com.xworkz.associationExample.objectMethods.example.things;

public class Vehicle {
	private String brand;
	private double price;
	private String colour;
	private String type;
	private int quantity;
	private boolean quality;
	private String owner;
	private String vehicleNo;
	private boolean PowerBreak;
	private boolean Start;
	
	
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", price=" + price + ", colour=" + colour + ", type=" + type + ", quantity="
				+ quantity + ", quality=" + quality + ", owner=" + owner + ", vehicleNo=" + vehicleNo + ", PowerBreak="
				+ PowerBreak + ", Start=" + Start + "]";
	}
	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in vehicle class");
		if(other instanceof Vehicle) {
			System.out.println("other is a vehicle , check properties");
			Vehicle CastedRef=(Vehicle)other;
			if(this.vehicleNo.equals(CastedRef.vehicleNo) && this.brand.equals(CastedRef.brand)) {
				System.out.println("Vehicle is same");
				return true;
			}
			else 
				System.out.println("Vehicle is differant");
		}else {
			System.err.println("other is not paint, can not chech th properties");
		}
		
		return false;
	}
	

	public Vehicle(String brand, double price, String colour, String type, int quantity, boolean quality, String owner,
			String vehicleNo, boolean powerBreak, boolean start) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
		this.owner = owner;
		this.vehicleNo = vehicleNo;
		this.PowerBreak = powerBreak;
		this.Start = start;
	}
	
	
	

	

}
