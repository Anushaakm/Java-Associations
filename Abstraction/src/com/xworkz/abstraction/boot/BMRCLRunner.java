package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.follower.Passengers;
import com.xworkz.abstraction.governor.BMRCL;
import com.xworkz.abstraction.rules.MetroRules;

public class BMRCLRunner {

	public static void main(String[] args) {

		MetroRules metro = new Passengers();
		BMRCL bmrcl = new BMRCL(metro);
		bmrcl.display();
	}

}