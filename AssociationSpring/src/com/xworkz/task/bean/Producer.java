package com.xworkz.task.bean;

import org.springframework.stereotype.Component;

@Component
public class Producer {
private Company company;
private Assistent assistent;
public Producer() {
	System.out.println("Created producer...");
}
	
}
