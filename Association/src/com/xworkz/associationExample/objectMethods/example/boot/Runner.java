package com.xworkz.associationExample.objectMethods.example.boot;

import com.xworkz.associationExample.objectMethods.example.things.*;

public class Runner {

	public static void main(String[] args) {

		Paint paint = new Paint("Asian", 350, "Yellow", "Indoor", 1, true, "KBS Anand", true, false, true);
		System.out.println(paint);

		Paint paint2 = new Paint("Asian", 546, "red", "Indoor", 1, true, "KBS Anand", true, false, true);
		System.out.println(paint2);

		boolean same = paint.equals(paint2);
		System.out.println(same);

		System.out.println("---------------------------------------------------------------------------------");

		Vehicle vehicle = new Vehicle("TVS", 123456, "WHITE", "BIKE", 1, true, "ANUSHA", "KA16 3454", true, true);
		System.out.println(vehicle);

		Vehicle vehicle2 = new Vehicle("TVS", 123456, "WHITE", "BIKE", 1, true, "ANUSHA", "KA14 3454", true, true);
		System.out.println(vehicle2);

		boolean same2 = vehicle.equals(vehicle2);
		System.out.println(same2);

		System.out.println("---------------------------------------------------------------------------------");

		WaterBottle waterBottle = new WaterBottle("Decothalon", 12345.6, "Black", "Plastic", 1, true, "ANUSHA",
				"KA16 3454", true, true);
		System.out.println(waterBottle);

		WaterBottle waterBottle2 = new WaterBottle("TVS", 123456, "WHITE", "BIKE", 1, true, "ANUSHA", "KA14 3454", true,
				true);
		System.out.println(waterBottle2);

		boolean same3 = waterBottle.equals(waterBottle2);
		System.out.println(same3);

		System.out.println("---------------------------------------------------------------------------------");
		Currency currenacy = new Currency("Yuan", 11.43, "China", "green", true, "Renminbi", 15, "china", 5678.9, true);

		System.out.println(currenacy);

		Currency currenacy2 = new Currency("Yuan", 11.43, "China", "green", true, "Renminbi", 15, "china", 5678.9,
				true);
		System.out.println(currenacy2);

		boolean same4 = currenacy.equals(currenacy2);
		System.out.println(same4);

		System.out.println("---------------------------------------------------------------------------------");
		God god = new God("Lakshmi", "Lakshmi", 1000, "na", "Bengaluru", 19380193, "ramachari", 456.5, true, "Monday");

		System.out.println(god);
		God god2 = new God("Lakshmi", "Lakshmi", 1000, "na", "Bengaluru", 19380193, "ramachari", 456.66, true,
				"Monday");
		System.out.println(god2);

		god.setFirstName("Shiva");
		System.out.println(god);

		boolean same5 = god.equals(god2);
		System.out.println(same5);

		// God god3=new God();
		// god3.setFirstName("Shiva");
		// System.out.println(god3);

		System.out.println("---------------------------------------------------------------------------------");
		Institution institution = new Institution("xworkz", "java", 30000, 10, "Aug-22", "Omkar", "Rajajinagar",
				123456789l, true, 2);
		System.out.println(institution);

		Institution institution2 = new Institution("xworkz", "java", 30000, 10, "Aug-22", "Omkar", "Rajajinagar",
				123456789l, true, 2);
		System.out.println(institution2);

		boolean same6 = institution.equals(institution2);
		System.out.println(same6);

		System.out.println("---------------------------------------------------------------------------------");

		Lipstick lipstick = new Lipstick("mat", 350, "huda", "pink", true, "Anusha", "new", "bengaluru", "Red Bull",
				"xyz");
		System.out.println(lipstick);

		Lipstick lipstick2 = new Lipstick("mat", 350, "huda", "pink", true, "Anusha", "new", "bengaluru", "Red Bull",
				"xyz");
		System.out.println(lipstick2);

		boolean same7 = lipstick.equals(lipstick2);
		System.out.println(same7);

		System.out.println("---------------------------------------------------------------------------------");

		Hospital hospital = new Hospital("Sharada", 2000, "good", "white", true, "sharada", 5, "Bengaluru", 3459.0,
				true);
		System.out.println(hospital);

		Hospital hospital2 = new Hospital("Sharada", 2000, "good", "white", true, "sharada", 5, "Bengaluru", 3459.0,
				true);
		System.out.println(hospital2);

		boolean same8 = hospital.equals(hospital2);
		System.out.println(same8);

	}

}
