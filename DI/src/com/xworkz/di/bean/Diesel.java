package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Fuel;
import com.xworkz.di.bridge.PetrolBunk;
@Component
public class Diesel implements Fuel {
	//@Autowired
	//PetrolBunk petrolBunk;
	
	public Diesel() {
		System.out.println("No-arg constroctor of diesel");
	}
	@Override
	public void consume() {
		System.out.println("created diesel consume using spring...");
//petrolBunk.purchase();
	}

}
