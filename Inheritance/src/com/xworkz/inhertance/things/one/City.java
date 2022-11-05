package com.xworkz.inhertance.things.one;

public class City extends Capital {
	public void cityMetod() {
		
		System.out.println("City is a child of capital, Capital is a child of place, place is a child of object, object is a parent class");
		System.out.println("=============================================");
		Object object =new Object();
		Place place=new Place();
		Capital capital=new Capital();
		City city=new City();
		
		
		Object place2=new Place();
		Place capital2=new Capital();
		Object capital3=new Capital();
		
		Capital city2=new City();
		Place city3=new City();
		Object city4=new City();
		
		
		}
}
