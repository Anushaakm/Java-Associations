package com.xworkz.abstraction.follower;

import com.xworkz.abstraction.rules.AirportRules;

public class Staff implements AirportRules {

		@Override
		public boolean passportChecking() {
			System.out.println("Running checking...");
			return true;
		}

		@Override
		public int no() {
			System.out.println("Running no of seats...");
			return 0;
		}

	}

