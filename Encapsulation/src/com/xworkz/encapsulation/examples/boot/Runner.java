package com.xworkz.encapsulation.examples.boot;

import com.xworkz.encapsulation.examples.things.Apple;
import com.xworkz.encapsulation.examples.things.Bingo;
import com.xworkz.encapsulation.examples.things.Book;
import com.xworkz.encapsulation.examples.things.Bread;
import com.xworkz.encapsulation.examples.things.Cake;
import com.xworkz.encapsulation.examples.things.Chips;
import com.xworkz.encapsulation.examples.things.Chocolate;
import com.xworkz.encapsulation.examples.things.Kurukure;
import com.xworkz.encapsulation.examples.things.Lunch;
import com.xworkz.encapsulation.examples.things.Milk;
import com.xworkz.encapsulation.examples.things.Orange;
import com.xworkz.encapsulation.examples.things.Owner;
import com.xworkz.encapsulation.examples.things.Pringles;
import com.xworkz.encapsulation.examples.things.Sweet;

public class Runner {

	public static void main(String[] args) {
		Lunch lunch = new Lunch();
		Chocolate chocolate=new Chocolate();
		Chips chips=new Chips();
		Apple apple=new Apple();
		Owner owner=new Owner();
		Kurukure kurukure=new Kurukure();
		Orange orange=new Orange();
		Bread bread=new Bread();
		Book book =new Book();
		Sweet sweet=new Sweet();
		Cake cake=new Cake();
		Milk milk = new Milk();
		Pringles pringles= new Pringles();
		Bingo bingo=new Bingo();
		
		owner.useLunchInfo();
		System.out.println("Reading  private properties of lunch class(encapsulation)");
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
		
		System.out.println("Reading  private properties of chocolate class(encapsulation)");
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

		System.out.println("Reading  private properties of Chips class(encapsulation)");

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
		
		System.out.println("Reading  private properties of Apple class(encapsulation)");
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
		
		System.out.println("Reading  private properties of Kurukure class(encapsulation)");
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
		
		System.out.println("Reading  private properties of Orange class(encapsulation)");
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
		
		System.out.println("Reading  private properties of Bread class(encapsulation)");
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
		
		
		System.out.println("Reading  private properties of book class(encapsulation)");
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
		
		System.out.println("Reading  private properties of sweet class(encapsulation)");
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
		
		System.out.println("Reading  private properties of Cake class(encapsulation)");
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
		
		System.out.println("Reading  private properties of Milk class(encapsulation)");
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
		
		System.out.println("Reading  private properties of pringles class(encapsulation)");
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
		
		System.out.println("Reading  private properties of bingo class(encapsulation)");
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
