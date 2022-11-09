package com.xworkz.inhertance.things.overRiding.boot;

import com.xworkz.inhertance.things.overRiding.child.Moon;

public class SatelliteRunner {

	
		public static void main(String[] args) {
			Moon moon = new Moon("Natural",17000.0,"White");
			moon.display();
		}
	}

