package com.xworkz.associationExample.two;

public class Person {
	public String name;
	public Email[] emails;
	public Job job;
	
	public Person(String name, Email[] emails, Job job) {
		this.name=name;
		this.emails=emails;
		this.job=job;
	}
	
	public void showOff() {
		
		System.out.println(name);
		
		if(emails!=null) {
			for (int i = 0; i < emails.length; i++) {
				Email email = emails[i];
				
				if(email!=null) {
					email.showOff();
				}
			}
		}else {
			System.out.println("email is null");
		}
		
		if(job!=null) {
			this.job.showOff();
		}
		else {
			System.out.println("Job is null");
		}
	}
}
