package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Company {

	public static void main(String[] args) {
		Collection<String> company=new ArrayList();
		company.add("TCS");
		company.add("Infosys");
		company.add("Wipro");
		company.add("HCL Technolies");
		company.add("LTI");
		company.add("Mphasis Ltd");
		company.add("Accenture");
		company.add("MindTree");
		company.add("Larsen & Toubro");
		company.add("Cognizant");
		company.add("Mahindra & Mahindra");
		company.add("ITC");
		company.add("Canara Bank");
		company.add("Bosch");
		company.add("KPIT Tech");
		company.add("Affle India");
		company.add("Birlasoft");
		company.add("Cyient");
		company.add("Persistent");
		company.add("Intellect Design");
		company.add("Sasken Tech");
		System.out.println(company);
		System.out.println(company.size());
		System.out.println("========================FOR LOOP TO ACCESS THE ELEMENT===========================");

		for(String element:company) {
			System.out.println(element);
		}
		System.out.println("========================WHILE LOOP TO ACCESS THE ELEMENT===========================");

		Iterator<String> itr = company.iterator();
		while (itr.hasNext()) {
			String ref = itr.next();
			System.out.println(ref);
		}
	}

}
