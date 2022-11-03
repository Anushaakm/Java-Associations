package com.xworkz.associationExample.two;

public class PersonRunner {

	public static void main(String[] args) {
		
		Country country=new Country("India", 91," Delhi", 30);
		State state=new State("karnataka","karnataka",null,"bengaluru");
		City city=new City("Chitradurga","karnataka",123,1020000000);
		Location location =new Location(5100060,"joganahalli",city,state,country);
		Company company=new Company("X-workz","Omkar",location);
		Job job=new Job(5.0,"SE",0,company);
		Email emailcopy1 =new Email("anushakm@gmail.com","ananu",8971919103l,company);
		Email emailcopy2 =new Email("anushakm.xworkz@gmail.com","anuanu",8971919103l,company);
		
		Email[] emails= {emailcopy1,emailcopy2};
		
		Person person =new Person("Anusha KM",emails,job);
		person.showOff();
		

	}

}
