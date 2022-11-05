package com.xworkz.inhertance.things.one;

public class Place extends Object{
	public void placeMethod() {
		
		System.out.println("Object is a Parent and Place is a Child");
		System.out.println("=============================================");
		Object object =new Object();
		Place place=new Place();
		Object place2=new Place();
		//Place ref=new Object();	--->not possible because child can not be a parent.
		
		
	}

}
