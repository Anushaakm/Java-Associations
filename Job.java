package com.xworkz.associationExample.two;

public class Job {
	public double salary;
	public String role;
	public int bond;
	public Company company;
	
	public Job(double salary, String role, int bond, Company company) {
		this.bond=bond;
		this.company=company;
		this.role=role;
		this.salary=salary;
		
	}
	
	public void showOff() {
		System.out.println(bond);
		System.out.println(role);
		System.out.println(salary);
		if(company!=null) {
			this.company.showOff();
		}
		else {
			System.out.println("company is null");
		}
	}
}
