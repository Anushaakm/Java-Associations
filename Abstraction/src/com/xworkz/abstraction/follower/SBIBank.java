package com.xworkz.abstraction.follower;

import com.xworkz.abstraction.rules.BankRules;

public class SBIBank implements BankRules {

	@Override
	public boolean major() {
		System.out.println("running major");
		return false;
	}

	@Override
	public double balance() {
		System.out.println("running balance");
		return 0;
	}

}
