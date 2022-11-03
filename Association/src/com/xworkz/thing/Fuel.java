package com.xworkz.thing;

import com.xworkz.constant.Type;

public class Fuel {
	public Brand brand=new Brand("HP",123,5);
	public boolean special=true;
	public Type type=Type.DIESEL;
	public double price;
	public double quantity;
	public Fuel(boolean special,double price,double quantity) {
		this.special=special;
		this.price=price;
		this.quantity=quantity;
		
	}
	public void showOff() {
		System.out.println(special);
		System.out.println(type);
		System.out.println(price);
		System.out.println(quantity);
		brand.showoff();
	}
}
