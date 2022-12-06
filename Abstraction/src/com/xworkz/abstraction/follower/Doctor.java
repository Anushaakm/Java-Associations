package com.xworkz.abstraction.follower;

import com.xworkz.abstraction.rules.HospitalRules;

public class Doctor implements HospitalRules {


	@Override
	public boolean maintainSilence() {
		System.out.println("Running maintain silence...");
		return true;
	}

	@Override
	public boolean doctor() {
		System.out.println("Running doctor");
		return false;
	}

}
