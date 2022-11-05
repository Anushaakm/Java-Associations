package com.xworkz.inhertance.things.one;

public class Capital extends Place{
	public void capitalMetod() {
	
	System.out.println("Capital is a child of place, place is a child of object, object is a parent class");
	System.out.println("=============================================");
	Object object =new Object();
	Place place=new Place();
	Capital capital=new Capital();
	
	Object place2=new Place();
	Place capital2=new Capital();
	Object capital3=new Capital();
	}
	
}
