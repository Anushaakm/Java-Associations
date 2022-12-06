package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.follower.Doctor;
import com.xworkz.abstraction.governor.HospitalManagement;
import com.xworkz.abstraction.rules.HospitalRules;

public class HospitalManagementRunner {

	public static void main(String[] args) {

		HospitalRules hospital = new Doctor();
		HospitalManagement management = new HospitalManagement(hospital);
		management.checking();
	}

}
