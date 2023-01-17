package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Fuel;
import com.xworkz.di.bridge.PetrolBunk;
@Component
public class Shell implements PetrolBunk {
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;//loose coupling, if we right class insted of 
	
	
	public Shell() {
		System.out.println("No-arg constroctor of Shell");
	}
	@Override
	public void purchase() {
		System.out.println("Created purches using spring...");
		fuel.consume();
	}

}
