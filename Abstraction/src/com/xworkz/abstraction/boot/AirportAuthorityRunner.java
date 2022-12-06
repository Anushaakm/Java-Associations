package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.follower.Staff;
import com.xworkz.abstraction.governor.AirportAuthority;
import com.xworkz.abstraction.rules.AirportRules;

public class AirportAuthorityRunner {

	public static void main(String[] args) {
	

				AirportRules airport = new Staff();
				AirportAuthority authority = new AirportAuthority(airport);
				authority.departure();
			}

		}

	


