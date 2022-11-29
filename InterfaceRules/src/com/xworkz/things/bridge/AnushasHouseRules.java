package com.xworkz.things.bridge;

import com.xworkz.things.rules.HomeRule;

public class AnushasHouseRules implements HomeRule {

	@Override
	public boolean veg() {
		System.out.println("running veg");
		return false;
	}

	@Override
	public String time() {
		System.out.println("running time");
		return null;
	}

	@Override
	public int people() {
		System.out.println("running people");
		return 0;
	}

	@Override
	public boolean pets() {
		System.out.println("running pets");
		return false;
	}

	@Override
	public boolean birds() {
		System.out.println("running birds");
		return false;
	}

}
