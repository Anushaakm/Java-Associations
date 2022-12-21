package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {

	public static void main(String[] args) {
		Collection<String> animals=new ArrayList();
		animals.add("Cat");
		animals.add("Tiger");
		animals.add("deer");
		animals.add("Cow");
		animals.add("Lion");
		animals.add("Ox");
		animals.add("Cheetah");
		animals.add("Elephant");
		animals.add("Camel");
		animals.add("Horse");
		
		System.out.println(animals);
		System.out.println(animals.size());
		System.out.println("========================FOR LOOP TO ACCESS THE ELEMENT===========================");
		for(String element:animals) {
			System.out.println(element);
		}
		
		System.out.println("========================WHILE LOOP TO ACCESS THE ELEMENT===========================");
		
		Iterator<String> itr=animals.iterator();
		while(itr.hasNext()) {
			String ref=itr.next();
			System.out.println(ref);
		}
	}

}
