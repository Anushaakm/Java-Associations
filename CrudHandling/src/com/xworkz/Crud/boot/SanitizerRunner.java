package com.xworkz.Crud.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.Crud.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {
		SanitizerDTO san1 = new SanitizerDTO(123, "Sterillium", 220D, "Blue", "Anusha", "System");
		SanitizerDTO san2 = new SanitizerDTO(124, "Savlon", 2D, "Orange", "Anusha", "System");
		SanitizerDTO san3 = new SanitizerDTO(null, "Dettol", 20D, "Green", "Anusha", "System");
		SanitizerDTO san4 = new SanitizerDTO(126, "Lifebuoy", 345D, null, "Anusha", "System");
		SanitizerDTO san5 = new SanitizerDTO(127, "Godrej", 340D, "Yellow", "Anusha", "System");
		SanitizerDTO san6 = new SanitizerDTO(128, "Babur", 420D, "Pink", "Anusha", "System");
		SanitizerDTO san7 = new SanitizerDTO(129, "Multani", 230D, "Red", "Anusha", "System");
		SanitizerDTO san8 = new SanitizerDTO(130, "Corvil", 10D, null, "Anusha", "System");
		SanitizerDTO san9 = new SanitizerDTO(131, "Trust", 4D, "white", "Anusha", "System");
		SanitizerDTO san10 = new SanitizerDTO(132, "DCM Shriram", 80D, "Blue", "Anusha", "System");

		Collection<SanitizerDTO> collection = new LinkedList<SanitizerDTO>();

		collection.add(san1);
		collection.add(san2);
		collection.add(san3);
		collection.add(san4);
		collection.add(san5);
		collection.add(san6);
		collection.add(san7);
		collection.add(san8);
		collection.add(san9);
		collection.add(san10);

		Iterator<SanitizerDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			SanitizerDTO element = itr.next();
			// System.out.println(element.getBrand());
			if (element.getPrice() > 5) {
				System.out.println(element.getBrand() + " Price is > 5: " + element.getPrice());
			}
		}

		Iterator<SanitizerDTO> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			SanitizerDTO element2 = itr1.next();

			if (element2.getId() == null || element2.getBrand() == null || element2.getColour() == null
					|| element2.getPrice() == null) {
				System.out.println(element2.getBrand() + " Having null");
			}

		}
		System.out.println("No of Sanitizer before remove:"+collection.size());
		Iterator<SanitizerDTO> itr2 = collection.iterator();
		while (itr2.hasNext()) {
			SanitizerDTO element3=itr2.next();
			if(element3.getColour()=="Green" || element3.getColour()=="Red" || element3.getColour()=="Blue") {
				itr2.remove();
			}
			
		}
		System.out.println("No of Sanitizer after remove:"+collection.size());
		
		Iterator<SanitizerDTO> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			SanitizerDTO element3=itr3.next();
			
			if(element3.getPrice()>345)
			System.out.println("Max price is : "+element3.getPrice());
			else if (element3.getPrice()<4)
				System.out.println("Min price is : "+element3.getPrice());
			else if (element3.getPrice()==345)
				System.out.println("2nd Max price : "+element3.getPrice());
		}
	}

}
