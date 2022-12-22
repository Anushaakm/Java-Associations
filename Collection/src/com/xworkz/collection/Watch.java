package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		Collection<String> watches=new ArrayList<String>();
		watches.add("Tatan");
		watches.add("Fastrack");
		watches.add("Chumbak");
		watches.add("Armani Exchange");
		watches.add("Raga");
		
		System.out.println(watches);
		System.out.println("========================FOR LOOP TO ACCESS THE ELEMENT===========================");
		for(String element:watches) {
			System.out.println(element);
		}
		
		System.out.println("========================WHILE LOOP TO ACCESS THE ELEMENT===========================");
		
		Iterator<String> itr=watches.iterator();
		while(itr.hasNext()) {
			String ref=itr.next();
			System.out.println(ref);
		}
	}

}
