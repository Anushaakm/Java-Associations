package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Fuel;
import com.xworkz.di.bridge.PetrolBunk;
@Component
public class Petrol implements Fuel {
	@Autowired
	PetrolBunk petrolBunk;
	
	public Petrol() {
		System.out.println("No-arg constroctor of PetrolS");
	}
	
	@Override
	public void consume() {
		System.out.println("Created petrol consume using spring...");
		//petrolBunk.purchase();

	}

}
