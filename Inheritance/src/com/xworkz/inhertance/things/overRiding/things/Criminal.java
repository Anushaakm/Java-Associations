package com.xworkz.inhertance.things.overRiding.things;

public class Criminal {
	public String type;
	public int imprisonment;

	public Criminal(String type, int imprisonment) {
		this.imprisonment = imprisonment;
		this.type = type;
	}

	public void display() {
		System.out.println(this.type);
		System.out.println(this.imprisonment);
	}
}
