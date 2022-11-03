package com.xworkz.thing;

public class Brand {
	public String name;
	public int gstNo;
	public int rating;
	public Location location=new Location("Bengaluru");
	
	public Brand(String name,int gstNo,int rating) {
		this.name=name;
		this.gstNo=gstNo;
		this.rating=rating;
	}
	public void showoff() {
		System.out.println(name);
		System.out.println(gstNo);
		System.out.println(rating);
		location.display();;
	}
}
