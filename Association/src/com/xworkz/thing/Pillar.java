package com.xworkz.thing;

import com.xworkz.constant.Shape;

public class Pillar {
	public int id;
	public String place;
	public Shape shape=Shape.CIRCULAR;
	public float height;
	public Company company=new Company("Vision pillars","Isolated");
	
	public Pillar(int id, String place, float height) {
		this.id=id;
		this.place=place;
		this.height=height;
		
	}
	
	public void showoff() {
		System.out.println(id);
		System.out.println(place);
		
		System.out.println(height);
		System.out.println(shape);
		this.company.showoff();
	}
	
}
