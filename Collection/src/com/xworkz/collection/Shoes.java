package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Shoes {

	public static void main(String[] args) {
		Collection<Integer> shoes = new ArrayList();
		shoes.add(1);
		shoes.add(2);
		shoes.add(3);
		shoes.add(4);
		shoes.add(5);
		shoes.add(6);
		shoes.add(7);
		shoes.add(8);
		shoes.add(9);
		shoes.add(10);
		shoes.add(11);
		shoes.add(12);
		shoes.add(13);
		shoes.add(14);
		shoes.add(15);

		System.out.println(shoes);
		System.out.println(shoes.size());
		System.out.println("========================FOR LOOP TO ACCESS THE ELEMENT===========================");
		for (Integer element : shoes) {
			System.out.println(element);
		}

		System.out.println("========================WHILE LOOP TO ACCESS THE ELEMENT===========================");

		Iterator<Integer> itr = shoes.iterator();
		while (itr.hasNext()) {
			int ref = itr.next();
			System.out.println(ref);
		}
	}
}
