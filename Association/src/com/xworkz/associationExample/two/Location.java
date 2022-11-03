package com.xworkz.associationExample.two;

public class Location {
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;

	public Location(int no,String street,City city,State state,Country country) {
		this.no=no;
		this.street=street;
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	public void showOff() {
		System.out.println(no);
		System.out.println(street);
		
		if(city!=null) {
			this.city.showOff();
		}
		else {
			System.out.println("city is null");
		}
		
		if(state!=null) {
			this.state.showOff();
		}
		else {
			System.out.println("state is null");
		}
		
		if(country!=null) {
			this.country.showOff();
		}
		else {
			System.out.println("country is null");
		}
		
	}
	
}
