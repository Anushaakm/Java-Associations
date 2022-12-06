package com.xworkz.things.bridge;

import com.xworkz.things.rules.DevelopmentInstitute;
import com.xworkz.things.rules.Institute;
import com.xworkz.things.rules.PGRules;
import com.xworkz.things.rules.TestingInstitute;

public class Xworkz implements Institute,DevelopmentInstitute, TestingInstitute,PGRules {

	@Override
	public String interview() {
		System.out.println("Running interview");
		return null;
	}

	@Override
	public String training() {
		System.out.println("Running training");
		return null;
	}

	@Override
	public String placement() {
		System.out.println("Running placements");
		return null;
	}

	@Override
	public String ProvidingFood() {
		System.out.println("Running ProvidingFood");
		return null;
	}

	@Override
	public boolean laundry() {
		System.out.println("Running laundry");
		return false;
	}

}
