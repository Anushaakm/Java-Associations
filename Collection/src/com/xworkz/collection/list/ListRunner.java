package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("N");
		list.add("U");
		list.add("S");
		list.add("H");
		list.add("A");
		list.add(1,"n");
		
		for(String string: list) {
			System.out.println(string);
			list.set(1, " ");
			list.remove(1);
			
		}
	}
}
