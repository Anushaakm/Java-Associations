package com.xworkz.encapsulation.examples.things;

public class Owner {
	public String ownerName = "Rajanna";
	public int age = 54;
	public Lunch lunch = new Lunch();
	public Chocolate chocolate=new Chocolate();
	public Chips chips=new Chips();
	public Apple apple=new Apple();
	public Kurukure kurukure=new Kurukure();
	public Orange orange=new Orange();
	public Bread bread=new Bread();
	public Book book=new Book();
	public Sweet sweet=new Sweet();
	public Cake cake=new Cake();
	public Milk milk=new Milk();
	public Pringles pringles=new Pringles();
	public Bingo bingo=new Bingo();
	
	public void useLunchInfo() {
		this.lunch = lunch;
		this.chocolate=chocolate;
		this.chips=chips;
		this.apple=apple;
		this.kurukure=kurukure;
		this.orange=orange;
		this.bread=bread;
		this.book=book;
		this.sweet=sweet;
		this.cake=cake;
		this.milk=milk;
		this.pringles=pringles;
		this.bingo=bingo;
		
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
		
System.out.println("kurukure information befor");
		
		System.out.println(kurukure.getShopName());
		System.out.println(kurukure.getPrice());
		System.out.println(kurukure.getQuantity());
		System.out.println(kurukure.getBrand());
		System.out.println(kurukure.getOrderedBy());
		System.out.println(kurukure.getOrderedOn());
		System.out.println(kurukure.getOrderNo());
		System.out.println(kurukure.getPrice());
		System.out.println(kurukure.getQuantity());
		System.out.println(kurukure.getByWith());
		System.out.println(kurukure.getFat());

		kurukure.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("kurkure information after Modification");

		System.out.println(kurukure.getShopName());
		System.out.println(kurukure.getPrice());
		System.out.println(kurukure.getQuantity());
		System.out.println(kurukure.getBrand());
		System.out.println(kurukure.getOrderedBy());
		System.out.println(kurukure.getOrderedOn());
		System.out.println(kurukure.getOrderNo());
		System.out.println(kurukure.getPrice());
		System.out.println(kurukure.getQuantity());
		System.out.println(kurukure.getByWith());
		System.out.println(kurukure.getFat());
		
System.out.println("Orange information befor");
		
		System.out.println(orange.getShopName());
		System.out.println(orange.getPrice());
		System.out.println(orange.getQuantity());
		System.out.println(orange.getBrand());
		System.out.println(orange.getOrderedBy());
		System.out.println(orange.getOrderedOn());
		System.out.println(orange.getOrderNo());
		System.out.println(orange.getPrice());
		System.out.println(orange.getQuantity());
		System.out.println(orange.getByWith());
		System.out.println(orange.getFat());

		orange.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("orange information after Modification");

		System.out.println(orange.getShopName());
		System.out.println(orange.getPrice());
		System.out.println(orange.getQuantity());
		System.out.println(orange.getBrand());
		System.out.println(orange.getOrderedBy());
		System.out.println(orange.getOrderedOn());
		System.out.println(orange.getOrderNo());
		System.out.println(orange.getPrice());
		System.out.println(orange.getQuantity());
		System.out.println(orange.getByWith());
		System.out.println(orange.getFat());

System.out.println("Bread information befor");
		
		System.out.println(bread.getShopName());
		System.out.println(bread.getPrice());
		System.out.println(bread.getQuantity());
		System.out.println(bread.getBrand());
		System.out.println(bread.getOrderedBy());
		System.out.println(bread.getOrderedOn());
		System.out.println(bread.getOrderNo());
		System.out.println(bread.getPrice());
		System.out.println(bread.getQuantity());
		System.out.println(bread.getByWith());
		System.out.println(bread.getFat());

		bread.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("bread information after Modification");

		System.out.println(bread.getShopName());
		System.out.println(bread.getPrice());
		System.out.println(bread.getQuantity());
		System.out.println(bread.getBrand());
		System.out.println(bread.getOrderedBy());
		System.out.println(bread.getOrderedOn());
		System.out.println(bread.getOrderNo());
		System.out.println(bread.getPrice());
		System.out.println(bread.getQuantity());
		System.out.println(bread.getByWith());
		System.out.println(bread.getFat());
		
System.out.println("book information befor");
		
		System.out.println(book.getShopName());
		System.out.println(book.getPrice());
		System.out.println(book.getQuantity());
		System.out.println(book.getBrand());
		System.out.println(book.getOrderedBy());
		System.out.println(book.getOrderedOn());
		System.out.println(book.getOrderNo());
		System.out.println(book.getPrice());
		System.out.println(book.getQuantity());
		System.out.println(book.getByWith());
		System.out.println(book.getFat());

		book.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("book information after Modification");

		System.out.println(book.getShopName());
		System.out.println(book.getPrice());
		System.out.println(book.getQuantity());
		System.out.println(book.getBrand());
		System.out.println(book.getOrderedBy());
		System.out.println(book.getOrderedOn());
		System.out.println(book.getOrderNo());
		System.out.println(book.getPrice());
		System.out.println(book.getQuantity());
		System.out.println(book.getByWith());
		System.out.println(book.getFat());

		System.out.println("Sweet information befor");
		System.out.println(sweet.getShopName());
		System.out.println(sweet.getPrice());
		System.out.println(sweet.getQuantity());
		System.out.println(sweet.getBrand());
		System.out.println(sweet.getOrderedBy());
		System.out.println(sweet.getOrderedOn());
		System.out.println(sweet.getOrderNo());
		System.out.println(sweet.getPrice());
		System.out.println(sweet.getQuantity());
		System.out.println(sweet.getByWith());
		System.out.println(sweet.getFat());
		
		sweet.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("Sweet information after Modification");
		System.out.println(sweet.getShopName());
		System.out.println(sweet.getPrice());
		System.out.println(sweet.getQuantity());
		System.out.println(sweet.getBrand());
		System.out.println(sweet.getOrderedBy());
		System.out.println(sweet.getOrderedOn());
		System.out.println(sweet.getOrderNo());
		System.out.println(sweet.getPrice());
		System.out.println(sweet.getQuantity());
		System.out.println(sweet.getByWith());
		System.out.println(sweet.getFat());
		
		System.out.println("Cake information befor");
		System.out.println(cake.getShopName());
		System.out.println(cake.getPrice());
		System.out.println(cake.getQuantity());
		System.out.println(cake.getBrand());
		System.out.println(cake.getOrderedBy());
		System.out.println(cake.getOrderedOn());
		System.out.println(cake.getOrderNo());
		System.out.println(cake.getPrice());
		System.out.println(cake.getQuantity());
		System.out.println(cake.getByWith());
		System.out.println(cake.getFat());
		
		cake.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("Cake information after Modification");
		System.out.println(cake.getShopName());
		System.out.println(cake.getPrice());
		System.out.println(cake.getQuantity());
		System.out.println(cake.getBrand());
		System.out.println(cake.getOrderedBy());
		System.out.println(cake.getOrderedOn());
		System.out.println(cake.getOrderNo());
		System.out.println(cake.getPrice());
		System.out.println(cake.getQuantity());
		System.out.println(cake.getByWith());
		System.out.println(cake.getFat());
		
		System.out.println("Cake information befor");
		System.out.println(milk.getShopName());
		System.out.println(milk.getPrice());
		System.out.println(milk.getQuantity());
		System.out.println(milk.getBrand());
		System.out.println(milk.getOrderedBy());
		System.out.println(milk.getOrderedOn());
		System.out.println(milk.getOrderNo());
		System.out.println(milk.getPrice());
		System.out.println(milk.getQuantity());
		System.out.println(milk.getByWith());
		System.out.println(milk.getFat());
		
		milk.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("Cake information after Modification");
		System.out.println(milk.getShopName());
		System.out.println(milk.getPrice());
		System.out.println(milk.getQuantity());
		System.out.println(milk.getBrand());
		System.out.println(milk.getOrderedBy());
		System.out.println(milk.getOrderedOn());
		System.out.println(milk.getOrderNo());
		System.out.println(milk.getPrice());
		System.out.println(milk.getQuantity());
		System.out.println(milk.getByWith());
		System.out.println(milk.getFat());
		
		System.out.println("pringles information befor");
		System.out.println(pringles.getShopName());
		System.out.println(pringles.getPrice());
		System.out.println(pringles.getQuantity());
		System.out.println(pringles.getBrand());
		System.out.println(pringles.getOrderedBy());
		System.out.println(pringles.getOrderedOn());
		System.out.println(pringles.getOrderNo());
		System.out.println(pringles.getPrice());
		System.out.println(pringles.getQuantity());
		System.out.println(pringles.getByWith());
		System.out.println(pringles.getFat());
		pringles.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("pringles information after Modification");
		System.out.println(pringles.getShopName());
		System.out.println(pringles.getPrice());
		System.out.println(pringles.getQuantity());
		System.out.println(pringles.getBrand());
		System.out.println(pringles.getOrderedBy());
		System.out.println(pringles.getOrderedOn());
		System.out.println(pringles.getOrderNo());
		System.out.println(pringles.getPrice());
		System.out.println(pringles.getQuantity());
		System.out.println(pringles.getByWith());
		System.out.println(pringles.getFat());
		
		System.out.println("pringles information befor");
		System.out.println(bingo.getShopName());
		System.out.println(bingo.getPrice());
		System.out.println(bingo.getQuantity());
		System.out.println(bingo.getBrand());
		System.out.println(bingo.getOrderedBy());
		System.out.println(bingo.getOrderedOn());
		System.out.println(bingo.getOrderNo());
		System.out.println(bingo.getPrice());
		System.out.println(bingo.getQuantity());
		System.out.println(bingo.getByWith());
		System.out.println(bingo.getFat());
		
		pringles.setProperties("vikranth", 5000, 21, "ABC3", "milk", "Sweets", false, "chips", true, 30, "Nayana",
				"Nov1", 5);

		System.out.println("pringles information after Modification");
		System.out.println(bingo.getShopName());
		System.out.println(bingo.getPrice());
		System.out.println(bingo.getQuantity());
		System.out.println(bingo.getBrand());
		System.out.println(bingo.getOrderedBy());
		System.out.println(bingo.getOrderedOn());
		System.out.println(bingo.getOrderNo());
		System.out.println(bingo.getPrice());
		System.out.println(bingo.getQuantity());
		System.out.println(bingo.getByWith());
		System.out.println(bingo.getFat());
	}

}
