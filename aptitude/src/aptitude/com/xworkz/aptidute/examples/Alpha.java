package aptitude.com.xworkz.aptidute.examples;

public class Alpha {
	public static void main(String[] args) {

		String str = "XYZ";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {

				if (j == 0) {
					System.out.print(str.toUpperCase().charAt(i));

				}
				
				else {

					System.out.print(str.toLowerCase().charAt(j));

				}
			}
		}
	}
}