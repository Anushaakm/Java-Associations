package com.xworkz.di.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.di.bridge.PetrolBunk;
import com.xworkz.di.configuration.PetrolBunkConfiguration;


public class Runner {

	public static void main(String[] args) {
	ApplicationContext container=new AnnotationConfigApplicationContext(PetrolBunkConfiguration.class);
	PetrolBunk petrolBunk=container.getBean(PetrolBunk.class);
	petrolBunk.purchase();
	
	}

}
