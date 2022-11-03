package com.xworkz.encapsulation.examples.things;

public class Owner {
	public String ownerName = "Rajanna";
	public int age = 54;
	public Lunch lunch = new Lunch();
	public Chocolate chocolate=new Chocolate();
	public Chips chips=new Chips();
	public Apple apple=new Apple();
	
	public void useLunchInfo() {
		this.lunch = lunch;
		this.chocolate=chocolate;
		this.chips=chips;
		this.apple=apple;
		
		System.out.println(ownerName);
		System.out.println(age);

		System.out.println("Lunch information befor");

		System.out.println(lunch.getHotelName());
		System.out.println(lunch.getChat());
		System.out.println(lunch.getDiscount());
		System.out.println(lunch.getMainCourse());
		System.out.println(lunch.getOrderedBy());
		System.out.println(lunch.getOrderedOn());
		System.out.println(lunch.getOrderNo());
		System.out.println(lunch.getPrice());
		System.out.println(lunch.getQuantity());
		System.out.println(lunch.getSideDish());
		System.out.println(lunch.getStarters());

		lunch.setProperties("Ambika", 500, 1, "tomato soup", "Meals", "NA", false, "chips", false, 333, "Nayana",
				"Nov1", 5);

		System.out.println("Lunch information after Modification");

		System.out.println(lunch.getHotelName());
		System.out.println(lunch.getChat());
		System.out.println(lunch.getDiscount());
		System.out.println(lunch.getMainCourse());
		System.out.println(lunch.getOrderedBy());
		System.out.println(lunch.getOrderedOn());
		System.out.println(lunch.getOrderNo());
		System.out.println(lunch.getPrice());
		System.out.println(lunch.getQuantity());
		System.out.println(lunch.getSideDish());
		System.out.println(lunch.getStarters());
		
		System.out.println("Chocolate information befor");

		System.out.println(chocolate.getShopName());
		System.out.println(chocolate.getPrice());
		System.out.println(chocolate.getQuantity());
		System.out.println(chocolate.getBrand());
		System.out.println(chocolate.getOrderedBy());
		System.out.println(chocolate.getOrderedOn());
		System.out.println(chocolate.getOrderNo());
		System.out.println(chocolate.getPrice());
		System.out.println(chocolate.getQuantity());
		System.out.println(chocolate.getByWith());
		System.out.println(chocolate.getFat());

		chocolate.setProperties("GURU", 500, 1, "ABC", "Dark", "Sweet", false, "chips", false, 30, "Nayana",
				"Nov1", 5);

		System.out.println("Chocolate information after Modification");

		System.out.println(chocolate.getShopName());
		System.out.println(chocolate.getPrice());
		System.out.println(chocolate.getQuantity());
		System.out.println(chocolate.getBrand());
		System.out.println(chocolate.getOrderedBy());
		System.out.println(chocolate.getOrderedOn());
		System.out.println(chocolate.getOrderNo());
		System.out.println(chocolate.getPrice());
		System.out.println(chocolate.getQuantity());
		System.out.println(chocolate.getByWith());
		System.out.println(chocolate.getFat());
		
		System.out.println("chips information befor");
		
		System.out.println(chips.getShopName());
		System.out.println(chips.getPrice());
		System.out.println(chips.getQuantity());
		System.out.println(chips.getBrand());
		System.out.println(chips.getOrderedBy());
		System.out.println(chips.getOrderedOn());
		System.out.println(chips.getOrderNo());
		System.out.println(chips.getPrice());
		System.out.println(chips.getQuantity());
		System.out.println(chips.getByWith());
		System.out.println(chips.getFat());

		chips.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("chips information after Modification");

		System.out.println(chips.getShopName());
		System.out.println(chips.getPrice());
		System.out.println(chips.getQuantity());
		System.out.println(chips.getBrand());
		System.out.println(chips.getOrderedBy());
		System.out.println(chips.getOrderedOn());
		System.out.println(chips.getOrderNo());
		System.out.println(chips.getPrice());
		System.out.println(chips.getQuantity());
		System.out.println(chips.getByWith());
		System.out.println(chips.getFat());
		
		System.out.println("apple information befor");
		System.out.println(apple.getHotelName());
		System.out.println(apple.getChat());
		System.out.println(apple.getDiscount());
		System.out.println(apple.getMainCourse());
		System.out.println(apple.getOrderedBy());
		System.out.println(apple.getOrderedOn());
		System.out.println(apple.getOrderNo());
		System.out.println(apple.getPrice());
		System.out.println(apple.getQuantity());
		System.out.println(apple.getSideDish());
		System.out.println(apple.getStarters());
		
		apple.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("apple information after Modification");

		System.out.println(apple.getHotelName());
		System.out.println(apple.getChat());
		System.out.println(apple.getDiscount());
		System.out.println(apple.getMainCourse());
		System.out.println(apple.getOrderedBy());
		System.out.println(apple.getOrderedOn());
		System.out.println(apple.getOrderNo());
		System.out.println(apple.getPrice());
		System.out.println(apple.getQuantity());
		System.out.println(apple.getSideDish());
		System.out.println(apple.getStarters());

	}

}
