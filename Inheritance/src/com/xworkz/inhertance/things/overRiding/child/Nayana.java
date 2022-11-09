package com.xworkz.inhertance.things.overRiding.child;

import com.xworkz.inhertance.things.overRiding.things.Criminal;

public class Nayana extends Criminal{
	public boolean jail;

	public Nayana(String type, int imprisonment, boolean jail) {
		super(type, imprisonment);
		this.jail = jail;
	}

	public void display() {
		super.display();
		System.out.println(this.jail);
	}
}
