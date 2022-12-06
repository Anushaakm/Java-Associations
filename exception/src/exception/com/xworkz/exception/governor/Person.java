package exception.com.xworkz.exception.governor;

public abstract class Person extends Object {
	String name;
	String branch;
	double fees;
	long yop;
	int instalment;

	public Person(String name, String branch, double fees, long yop, int instalment) {
		this.name = name;
		this.branch = branch;
		this.fees = fees;
		this.yop = yop;
		this.instalment = instalment;
	}

	public void eat() {
		System.out.println("running eat method....");
	}

	public void sleep() {
		System.out.println("running sleep method....");
	}

	public void display() {
		System.out.println(name);
		System.out.println(branch);
		System.out.println(fees);
		System.out.println(yop);
		System.out.println(instalment);
	}

}
