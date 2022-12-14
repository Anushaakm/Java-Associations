package com.xworkz.associationExample.objectMethods.example.things;

public class Lipstick {
	 private String name;
	 private double price;
	 private String companyName;
	 private String color;
	 private boolean rating;
	 private String ownerName;
	 private String companyStarted;
	 private String productionArea;
	 private String user;
	 private String taxName;

	public Lipstick(String name, double price, String companyName, String color, boolean rating, String ownerName,
			String companyStarted, String productionArea, String user, String taxName) {
		super();
		this.name = name;
		this.price = price;
		this.companyName = companyName;
		this.color = color;
		this.rating = rating;
		this.ownerName = ownerName;
		this.companyStarted = companyStarted;
		this.productionArea = productionArea;
		this.user = user;
		this.taxName = taxName;
	}

	@Override
	public String toString() {
		return "lipstick [name=" + name + ", price=" + price + ", companyName=" + companyName + ", color=" + color
				+ ", rating=" +rating + ", ownerName=" + ownerName + ", companyStarted=" + companyStarted
				+ ", productionArea=" + productionArea + ", user=" +user+ ", taxIncluded="
				+ taxName + "]";
	}

	public boolean equals(Object obj) {

		if(obj instanceof Lipstick)
		{
			Lipstick lip = (Lipstick)obj;
			if(this.name.equals(lip.name)&&this.companyName.equals(lip.companyName)&&this.color.equals(lip.color)&&this.companyStarted.equals(lip.companyStarted)&&this.ownerName.equals(lip.ownerName)&&this.productionArea.equals(lip.productionArea)&&this.user.equals(lip.user)&&this.taxName.equals(lip.taxName)&&this.price==lip.price&&this.rating==lip.rating)
			{

				System.out.println("equal Lipstick");
				return true;

			}
		}
	   else
			{
				System.out.println(" are not equal");
			}

		
			return false;

	}

}
