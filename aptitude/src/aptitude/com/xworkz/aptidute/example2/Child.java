package aptitude.com.xworkz.aptidute.example2;

class Child extends Parent {

	  int a = 100;
	  String s = "Happy Coding!";

	  
	  void print() {
	    // referencing to the instance variable of parent class
	    System.out.println("Number from parent class is : " + super.a);
	    System.out.println("String from parent class is : " + super.s);

	    // printing a and s of the current/child class
	    System.out.println("Number from child class is : " + a);
	    System.out.println("String from child class is : " + s);
	  }
	}