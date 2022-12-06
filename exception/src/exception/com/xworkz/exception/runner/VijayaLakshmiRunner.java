package exception.com.xworkz.exception.runner;

import exception.com.xworkz.exception.governor.Person;
import exception.com.xworkz.exception.governor.VijayaLakshmi;

public class VijayaLakshmiRunner {

	public static void main(String[] args) {
		VijayaLakshmi ref = new VijayaLakshmi("anusha", "cse", 10.5, 2022, 2);
		ref.completedProgram();
		ref.paidTax(10000);
		ref.gst();
		ref.uploadedTask();
		ref.vat();
		ref.eat();
		ref.sleep();
		ref.training();
		ref.executeProgram();
		ref.display();

	}

}
