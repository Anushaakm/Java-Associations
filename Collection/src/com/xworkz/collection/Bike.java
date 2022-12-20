package com.xworkz.collection;


import java.util.Collection;
import java.util.HashSet;

public class Bike {

	public static void main(String[] args) {
		Collection<String> collection=new HashSet();
		collection.add("Hero");
		collection.add("Honda");
		collection.add("KTM");
		collection.add("TVS");
		collection.add("HarlyDavidson");
		collection.add("RoyalEnfild");
		collection.add("Bhajaj");
		collection.add("Suzuki");
		collection.add("Yamaha");
		collection.add("BMW");
		collection.add("Aprilla");
		collection.add("Dukati");
		collection.add("Kavasaki");
		collection.add("Vespa");
		collection.add("Bianchi");
		collection.add("Java");
		collection.add("CannonDale");
		collection.add("Specialized");
		collection.add("Gaint");
		
		System.out.println(collection);
		System.out.println(collection.size());
		collection.clear();
		System.out.println("After Clearing ArrayList");
		System.out.println(collection.size());
		System.out.println(collection);



	}

}
