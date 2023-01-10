package com.xworkz.spring.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class ParleGConfig {
	
	@Bean("name")
	public String name() 
	{
		System.out.println("registering name with string...");
		String string1=new String();
		string1="anu";
		System.out.println(string1);
		return "ParleG";
		
	}
	@Bean("location")
	public String location() 
	{
		System.out.println("registering location with string...");
		String string2=new String();
		return "Chitradurga";
		
	}
	@Bean("addedItems")
	public String addedItems() 
	{
		System.out.println("registering name with string...");
		String string3=new String();
		return "suger";
		
	}
	@Bean("company")
	public String company() 
	{
		System.out.println("registering name with string...");
		String string4=new String();
		return "britannia";
		
	}
	@Bean("owner")
	public String owner() 
	{
		System.out.println("registering name with string...");
		String string5=new String();
		System.out.println("string5");
		return "Vijay Chauhan";
		
	}
	@Bean("bigCompany")
	public Boolean bigCompany() {
		System.out.println("Registered bigCompany with spring....");
		Boolean boolean1 = new Boolean(true);
		return true;
	}

	@Bean("oldCompany")
	public Boolean oldCompany() {
		System.out.println("Registered oldCompany with spring....");
		Boolean boolean2 = new Boolean(true);
		return true;
	}

	@Bean("famous")
	public Boolean famous() {
		System.out.println("Registered famous with spring....");
		Boolean boolean3 = new Boolean(true);
		return true;
	}

	@Bean("runningProfit")
	public Boolean runningProfit() {
		System.out.println("Registered runningProfit with spring....");
		Boolean boolean4 = new Boolean(true);
		return true;
	}

	@Bean("ownerAlive")
	public Boolean companyIsSuccesfull() {
		System.out.println("Registered ownerAlive with spring....");
		Boolean boolean5 = new Boolean(true);
		return true;
	}

	@Bean("companyProducts")
	public Double companyProducts() {
		System.out.println("Registered companyProducts with spring....");
		Double double1 = new Double(123D);
		return double1;
	}

	@Bean("companyIncome")
	public Double companyIncome() {
		System.out.println("Registered companyIncome with spring");
		Double double1 = new Double(456d);
		return double1;
	}

	@Bean("ProductsHighestPrice")
	public Double ProductsHighestPrice() {
		System.out.println("Registered ProductsHighestPrice with spring");
		Double double1 = new Double(789d);
		return double1;
	}

	@Bean("ProductsLeastPrice")
	public Double ProductsLeastPrice() {
		System.out.println("Registered ProductsLeastPrice with spring");
		Double double1 = new Double(776d);
		return double1;
	}

	@Bean("tax")
	public Double Tax() {
		System.out.println("Registered companyTax with spring");
		Double double1 = new Double(200d);
		System.out.println(double1);
		
		return double1;
	}

	@Bean("companyName")
	public StringBuffer buffName() {
		System.out.println("Registered companyName  with Spring");
		StringBuffer string = new StringBuffer("Nayana");
		System.out.println(string);
		return string;
	}

	@Bean("brandName")
	public StringBuffer buffBrandName() {
		System.out.println("Registered brandName  with Spring");
		StringBuffer string = new StringBuffer("Shrisham");
		return string;}
		
		@Bean("firstName")
		public StringBuffer buffCompanyFirstName() {
			System.out.println("Registered FirstName  with Spring");
			StringBuffer string = new StringBuffer("Smruthi");
			return string;
		}

		@Bean("lastName")
		public StringBuffer buffOwnerLastName() {
			System.out.println("Registered lastName  with Spring");
			StringBuffer string = new StringBuffer("Shashank");
			return string;
		}
		@Bean("location")
		public StringBuffer buffLocation() {
			System.out.println("Registered location  with Spring");
			StringBuffer string = new StringBuffer("Shashank");
			return string;
		}

		@Bean("companie")
		public StringBuilder companie() {
			System.out.println("Registered companyCEOName  with Spring");
			StringBuilder string = new StringBuilder("Britania");
			return string;
		}

		@Bean("companyName")
		public StringBuilder companyName() {
			System.out.println("Registring companyName  with Spring");
			StringBuilder string = new StringBuilder(" a ");
			return string;
		}

		@Bean("brandName")
		public StringBuilder builderBrandName() {
			System.out.println("Registring brandName  with Spring");
			StringBuilder string = new StringBuilder("b");
			return string;
		}

		@Bean("ownerFirstName")
		public StringBuilder ownerFirstName() {
			System.out.println("Registring ownerFirstName  with Spring");
			StringBuilder string = new StringBuilder("c");
			return string;
		}

		@Bean("ownerLastName")
		public StringBuilder ownerLastName() {
			System.out.println("Registring ownerLastName  with Spring");
			StringBuilder string = new StringBuilder("d");
			return string;
		}
			
		@Bean("arrayListValues")
		public ArrayList arrayList() {
			List<Integer> list = new ArrayList<Integer>();
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			//System.out.println(list);
			return (ArrayList) list;
		}

		@Bean("mapCityAndPincodes")
		public Map pincodes() {
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("Chitradurga", 577520);
			map.put("SHivamoga", 577401);
			map.put("Davanagere", 577002);
			map.put("Banglore", 001);
			map.put("Mysore", 002);
			//System.out.println(map);
			return map;
		}

	}
