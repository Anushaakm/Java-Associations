package com.xworkz.inhertance.things.one;

public class Bengaluru extends SiliconcCity{
public void bengaluruMetod() {
		
		System.out.println("Bengaluru is a child of SiliconCity, Siliconcity is a child of metrocity, Metro city is child of city, City is a child of capital, Capital is a child of place, place is a child of object, object is a parent class");
		System.out.println("=============================================");
		Object object =new Object();
		Place place1=new Place();
		Capital capital1=new Capital();
		City city1=new City();
		MetroCity metro1=new MetroCity();
		SiliconcCity silicon1=new SiliconcCity();
		Bengaluru bengaluru =new Bengaluru();
		
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
		
		MetroCity silicon2=new SiliconcCity();
		City silicon3=new SiliconcCity();
		Capital silicon4=new SiliconcCity();
		Place silicon5=new SiliconcCity();
		Object silicon6=new SiliconcCity();
		
		SiliconcCity bengaluru2=new Bengaluru();
		MetroCity bengaluru3=new Bengaluru();
		City bengaluru4=new Bengaluru();
		Capital bengaluru5=new Bengaluru();
		Place bengaluru6=new Bengaluru();
		Object bengaluru7=new Bengaluru();
		
		
		}
}
