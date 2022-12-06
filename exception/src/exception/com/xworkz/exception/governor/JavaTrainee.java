package exception.com.xworkz.exception.governor;

import exception.com.xworkz.exception.rules.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String name, String branch, double fees, long yop, int instalment) {
		super(name, branch, fees, yop, instalment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("running uploadedtask....");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("running completedProgram....");
		return false;
	}

	public void training() {
		System.out.println("running training");
	}

	public void executeProgram() {
		System.out.println("running executeProgram");
	}

}
