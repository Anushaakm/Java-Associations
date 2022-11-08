package com.xworkz.inhertance.things.casting.child;

import com.xworkz.inhertance.things.casting.Court;

public class DistrictCourt extends Court {
	public String judgeName;
	public int noOfLawyers;

	public DistrictCourt() {
		System.out.println("default constructor of DistrictCourt");
	}

}
