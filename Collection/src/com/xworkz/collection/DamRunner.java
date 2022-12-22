package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamRunner {

	public static void main(String[] args) {
		Collection<String> karnataka = new ArrayList();
		karnataka.add("Tunga Bhara Dam");
		karnataka.add("Linganmakki dam");
		karnataka.add("Kadar Dam");
		karnataka.add("Alamatti Dam");
		karnataka.add("Supa Dam");
		karnataka.add("Krishna Raja Sagara Dam");
		karnataka.add("Harangi Dam");
		karnataka.add("Narayanapur Dam");
		karnataka.add("Kodasalli Dam");
		System.out.println("No of dams in karnataka : "+karnataka.size());

		Collection<String> telangana = new ArrayList();
		telangana.add("Nizam Sagar Dam");
		telangana.add("Singur Dam");
		telangana.add("Radhanagari Dam");
		telangana.add("Lower Manair Dam");
		telangana.add("Mid Manair Dam");
		telangana.add("Upper Manair Dam");
		System.out.println("No of dams in telangana: "+telangana.size());

		Collection<String> andra = new ArrayList();
		andra.add("Somasila Dam");
		andra.add("Srisailam Dam");
		System.out.println("No of dams in andra"+andra.size());

		Collection<String> gujarat = new ArrayList();
		gujarat.add("Ukai Dam");
		gujarat.add("Dharoi Dam");
		gujarat.add("Kadana Dam");
		gujarat.add("Dantiwada Dam");
		System.out.println("No of dams in gujarat: "+gujarat.size());

		Collection<String> himachalPradesh = new ArrayList();
		himachalPradesh.add("Pandoh Dam");
		himachalPradesh.add("Bhakra Nangal Dam");
		himachalPradesh.add("Nathpa Jhakri Dam");
		himachalPradesh.add("Chamera Dam");
		System.out.println("No of dams in himachalPradesh: "+himachalPradesh.size());

		Collection<String> jammuAndKashmir = new ArrayList();
		jammuAndKashmir.add("Baglihar Dam");
		jammuAndKashmir.add("Dumkhar Hydroelectric Dam");
		jammuAndKashmir.add("Uri Hydroelectric Dam");
		System.out.println("No of dams in jammuAndKashmir: "+jammuAndKashmir.size());

		Collection<String> jharkhand = new ArrayList();
		jharkhand.add("Maithon Dam");
		jharkhand.add("Chandil Dam");
		jharkhand.add("Panchet Dam");
		System.out.println("No of dams in jharkhand: "+jharkhand.size());

		Collection<String> kerala = new ArrayList();
		kerala.add("Malampuzha Dam");
		kerala.add("Peechi Dam");
		kerala.add("Idukki Dam");
		kerala.add("Kundala Dam");
		kerala.add("Parambikulam Dam");
		kerala.add("Walayar Dam");
		kerala.add("Mullaperiyar Dam");
		kerala.add("Neyyar Dam");
		System.out.println("No of dams in kerala: "+kerala.size());

		Collection<String> madyaPradesh = new ArrayList();
		madyaPradesh.add("Barna Dam");
		madyaPradesh.add("Bargi Dam");
		madyaPradesh.add("Bansagar Dam");
		madyaPradesh.add("Gandhi Sagar Dam");
		System.out.println("No of dams in madyaPradesh: "+madyaPradesh.size());

		Collection<String> maharashtra = new ArrayList();
		maharashtra.add("Yeldari Dam");
		madyaPradesh.add("Ujani Dam");
		madyaPradesh.add("Pawna Dam");
		madyaPradesh.add("Mulshi Dam");
		madyaPradesh.add("Koyna Dam");
		madyaPradesh.add("Jayakwadi Dam");
		madyaPradesh.add("Bhatsa Dam");
		madyaPradesh.add("Wilson Dam");
		madyaPradesh.add("Tansa Dam");
		madyaPradesh.add("Panshet Dam");
		madyaPradesh.add("Mula Dam");
		madyaPradesh.add("Kolkewadi Dam");
		System.out.println("No of dams in maharashtra: "+maharashtra.size());

		Collection<String> odisha = new ArrayList();
		maharashtra.add("Indravati Dam");
		maharashtra.add("Hirakud Dam");
		System.out.println("No of dams in odisha: "+odisha.size());

		Collection<String> tamilNadu = new ArrayList();
		tamilNadu.add("Vaigai Dam");
		tamilNadu.add("Perunchani Dam");
		tamilNadu.add("Mettur Dam");
		System.out.println("No of dams in tamilNadu"+tamilNadu.size());

		Collection<String> uttarakhand = new ArrayList();
		uttarakhand.add("Tehri Dam");
		uttarakhand.add("Dhauli Ganga Dam");
		System.out.println("No of dams in uttarakhand: "+uttarakhand.size());

		Collection<String> goa = new ArrayList();
		goa.add("Anjunam Dam");
		goa.add("M.I Dam");
		goa.add("Salaulim Dam");
		System.out.println("No of dams in goa: "+goa.size());

		Collection<String> meghalaya = new ArrayList();
		meghalaya.add("Khandong Dam");
		meghalaya.add("umiam st-III Dam");
		meghalaya.add("Mawphlang Dam");
		meghalaya.add("Myntdu-leshka Dam");
		meghalaya.add("nayan");
		System.out.println("No of dams in meghalaya: "+meghalaya.size());

		Collection<String> damsInIndia = new ArrayList();
		damsInIndia.addAll(karnataka);
		damsInIndia.addAll(telangana);
		damsInIndia.addAll(andra);
		damsInIndia.addAll(gujarat);
		damsInIndia.addAll(kerala);
		damsInIndia.addAll(madyaPradesh);
		damsInIndia.addAll(maharashtra);
		damsInIndia.addAll(uttarakhand);
		damsInIndia.addAll(jharkhand);
		damsInIndia.addAll(himachalPradesh);
		damsInIndia.addAll(jammuAndKashmir);
		damsInIndia.addAll(tamilNadu);
		damsInIndia.addAll(odisha);
		damsInIndia.addAll(goa);
		damsInIndia.addAll(meghalaya);
		System.out.println(damsInIndia);

		Iterator<String> itr = damsInIndia.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			if (element.startsWith("T"))
				System.out.println("Dam start with T: " + element);
		}

		Iterator<String> itr0 = damsInIndia.iterator();
		while (itr0.hasNext()) {
			String element = itr0.next();
			if (element.endsWith("am"))
				System.out.println("Dam end with am: " + element);
		}

		Iterator<String> itr1 = damsInIndia.iterator();
		while (itr1.hasNext()) {
			String element = itr1.next();
			if (element.length() > 15)
				System.out.println("Dam length > 15: " + element);
		}

		Iterator<String> itr2 = damsInIndia.iterator();
		while (itr2.hasNext()) {
			String element = itr2.next();
			// String a=element.toUpperCase();
			System.out.println(element.toUpperCase());
		}

		Iterator<String> itr3 = damsInIndia.iterator();
		while (itr3.hasNext()) {
			String element = itr3.next();
			// String a=element.toUpperCase();
			System.out.println(element.toLowerCase());

		}

		Iterator<String> itr4 = damsInIndia.iterator();
		while (itr4.hasNext()) {
			String str = itr4.next();
			String strrev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				strrev = strrev + str.charAt(i);

			}
			if (strrev.equalsIgnoreCase(str)) {
				System.out.println("Element is palindrome");
			} else {
				System.out.println("element is not a palindrome");
			}
		}
		System.out.println("Indian dams before remove:"+ damsInIndia.size());
		Iterator<String> itr5= damsInIndia.iterator();
		while (itr5.hasNext()) {
			String element = itr5.next();
			if(element.contains("P")) {
				itr5.remove();
			}

		}
		System.out.println("Indian dams After remove:"+ damsInIndia.size());
	}

}
