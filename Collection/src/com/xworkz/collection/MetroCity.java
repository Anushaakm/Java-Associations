package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCity {

	public static void main(String[] args) {
		Collection<String> mCities=new ArrayList();
		mCities.add("Banglore");
		mCities.add("Delhi");
		mCities.add("Chennai");
		mCities.add("Mumbai");
		mCities.add("Kolkata");
		
		System.out.println(mCities);
		System.out.println(mCities.size());
		System.out.println("========================FOR LOOP TO ACCESS THE ELEMENT===========================");

		for(String element:mCities) {
			System.out.println(element);
		}
		System.out.println("========================WHILE LOOP TO ACCESS THE ELEMENT===========================");

		Iterator<String> itr = mCities.iterator();
		while (itr.hasNext()) {
			String ref = itr.next();
			System.out.println(ref);
		}
	}

}
