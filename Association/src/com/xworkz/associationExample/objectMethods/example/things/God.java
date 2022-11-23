package com.xworkz.associationExample.objectMethods.example.things;

public class God {
	private String name;
	private String firstName;
	private int temples;
	private String godsWife;
	private String location;
	private int totalTemples;
	private String priestName;
	private double kanike;
	private boolean prasada;
	private String poojeWeek;

	

	public God(String name, String firstName, int temples, String godsWife, String location, int totalTemples,
			String priestName, double kanike, boolean prasada, String poojeWeek) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.temples = temples;
		this.godsWife = godsWife;
		this.location = location;
		this.totalTemples = totalTemples;
		this.priestName = priestName;
		this.kanike = kanike;
		this.prasada = prasada;
		this.poojeWeek = poojeWeek;
	}

	
	@Override
	public String toString() {
		return "God [name=" + name + ", firstName=" + firstName + ", temples=" + temples + ", godsWife=" + godsWife
				+ ", location=" + location + ", totalTemples=" + totalTemples + ", priestName=" + priestName
				+ ", kanike=" + kanike + ", prasada=" + prasada + ", PoojeWeek=" + poojeWeek + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof God) {
			System.out.println("this both are diffrent");
			God god3 = (God) obj;
			if (this.location.equals(god3.location) && this.name.equals(god3.name)
					&& this.firstName.equals(god3.firstName)) {
				System.out.println("same");
				return true;

			} else {
				System.err.println("not same ");

			}

		}
		return false;
		}
}
