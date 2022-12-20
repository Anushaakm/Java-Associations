package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Sweet {

	public static void main(String[] args) {
	Collection<String> collection=new ArrayList();
	collection.add("Holige");
	collection.add("Gulab Jamun");
	collection.add("Coconut Burfi");
	collection.add("Jalebi");
	collection.add("Rava Laddu");
	collection.add("Kaju Katli");
	collection.add("Payasam");
	collection.add("Peda");
	collection.add("Rava Kesari");
	collection.add("Puran");
	collection.add("Carrot Halwa");
	collection.add("Besan Ladoo");
	collection.add("Mysore Pak");
	System.out.println(collection);
	System.out.println(collection.size());
	collection.clear();
	System.out.println("After Clearing ArrayList");
	System.out.println(collection.size());
	System.out.println(collection);

	}

}
