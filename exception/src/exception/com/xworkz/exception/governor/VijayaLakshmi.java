package exception.com.xworkz.exception.governor;

import exception.com.xworkz.exception.governor.JavaTrainee;
import exception.com.xworkz.exception.rules.KarnatakaRTO;

public class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO {

	public VijayaLakshmi(String name, String branch, double fees, long yop, int instalment) {
		super(name, branch, fees, yop, instalment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean paidTax(double tax) {
		System.out.println("running tax method");
		System.out.println(tax);
		return false;
	}

	@Override
	public double gst() {
		System.out.println("running gst method");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("running vat method");
		return 0;
	}

}
