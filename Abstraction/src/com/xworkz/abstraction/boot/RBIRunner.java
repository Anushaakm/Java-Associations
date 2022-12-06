package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.follower.SBIBank;
import com.xworkz.abstraction.governor.RBI;
import com.xworkz.abstraction.rules.BankRules;

public class RBIRunner {

	public static void main(String[] args) {
		BankRules bank = new SBIBank();
		RBI rbi = new RBI(bank);
		rbi.check();

	}

}
