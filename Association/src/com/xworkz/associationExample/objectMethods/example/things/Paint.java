package com.xworkz.associationExample.objectMethods.example.things;

public class Paint {
	private String brand;
	private double price;
	private String colour;
	private String usedFor;
	private int quantity;
	private boolean quality;
	private String owner;
	private boolean waterResistance;
	private boolean heatResistance;
	private boolean quickDrying;
	
	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", price=" + price + ", colour=" + colour + ", usedFor=" + usedFor
				+ ", quantity=" + quantity + ", quality=" + quality + ", owner=" + owner + ", waterResistance="
				+ waterResistance + ", heatResistance=" + heatResistance + ", quickDrying=" + quickDrying + "]";
	}
	
	@Override
	public boolean equals(Object other) {
	System.out.println("running equals method in Paint");
	
	
	//1)check other is a instance of paint
	if(other instanceof Paint) {
		System.out.println("other is paint, can check the properties");
		
		
		Paint castedRef = (Paint)other;//2)casting because to use all the properties by converting parent ref to child ref.
		if(this.colour.equals(castedRef.colour)) {
			System.out.println("colour is same");
			return true;
		}
	}
	else {
		System.err.println("other is not paint, can not chech the properties");
	}
	
		return false;
	}
	
	public Paint(String brand, double price, String colour, String usedFor, int quantity, boolean quality, String owner,
			boolean waterResistance, boolean heatResistance, boolean quickDrying) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.usedFor = usedFor;
		this.quantity = quantity;
		this.quality = quality;
		this.owner = owner;
		this.waterResistance = waterResistance;
		this.heatResistance = heatResistance;
		this.quickDrying = quickDrying;
	}
	
	
	
	
}
