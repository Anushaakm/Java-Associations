package com.xworkz.encapsulation.examples.boot;

import com.xworkz.encapsulation.examples.things.Apple;
import com.xworkz.encapsulation.examples.things.Chips;
import com.xworkz.encapsulation.examples.things.Chocolate;
import com.xworkz.encapsulation.examples.things.Lunch;
import com.xworkz.encapsulation.examples.things.Owner;

public class Runner {

	public static void main(String[] args) {
		Lunch lunch = new Lunch();
		Chocolate chocolate=new Chocolate();
		Chips chips=new Chips();
		Apple apple=new Apple();
		Owner owner=new Owner();
		
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
	}

}
