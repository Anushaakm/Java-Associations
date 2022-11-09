package com.xworkz.inhertance.things.overRiding.child;

import com.xworkz.inhertance.things.overRiding.things.Director;

public class Mansa extends Director {
	public String gender;

	public Mansa(String movie, int experience, String gender) {
		super(movie, experience);
		this.gender = gender;
	}

	public void display() {
		super.display();
		System.out.println(gender);
	}
}
