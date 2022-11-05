package com.xworkz.inhertance.things.one;

public class MetroCity extends City {
public void metroCityMetod() {
		
		System.out.println("Metro city is child of city, City is a child of capital, Capital is a child of place, place is a child of object, object is a parent class");
		System.out.println("=============================================");
		Object object =new Object();
		Place place1=new Place();
		Capital capital1=new Capital();
		City city1=new City();
		MetroCity metro1=new MetroCity();
		
		
		Object place2=new Place();
		Place capital2=new Capital();
		Object capital3=new Capital();
		
		Capital city2=new City();
		Place city3=new City();
		Object city4=new City();
		
		City metro2=new MetroCity();
		Capital metro3=new MetroCity();
		Place metro4=new MetroCity();
		Object metro5=new MetroCity();
		
		
		
		}
}
