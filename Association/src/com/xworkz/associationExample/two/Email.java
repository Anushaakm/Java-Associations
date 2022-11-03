package com.xworkz.associationExample.two;

public class Email {
	public String id;
	public String password;
	public long mobileNo;
	public Company company;
	
	public Email(String id, String password,long mobileNo, Company company) {
		this.id=id;
		this.password=password;
		this.mobileNo=mobileNo;
		this.company=company;
		
	}
	public void showOff() {
		System.out.println(id);
		System.out.println(password);
		System.out.println(mobileNo);
		if(company!=null) {
			this.company.showOff();
		}
		else {
			System.out.println("company is null");
		}
		
	}
}
