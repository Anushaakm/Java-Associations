package aptitude.com.xworkz.aptidute.examples;

public class Pyramid {
	

		public static void main(String[] args) {
			int n=3;
			
			//for row as well as space
			for (int i = 0; i <= n; i++) {
				//print char
				for (int j = 0; j <= i; j++) {

					System.out.print("*");
				}

				System.out.println(" ");
			}
			
			
			
			System.out.println(" ----------------");
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= i; j++) {

					System.out.print(" " + i);
				}

				System.out.println(" ");
			}
			
			
			
			System.out.println(" ---------------------");
			for (int i = 1; i <= 3; i++) {
				for (int j=i; j <= 3; j++) {

					System.out.print(j);
				}

				System.out.println(" ");
			}

		}
	}
