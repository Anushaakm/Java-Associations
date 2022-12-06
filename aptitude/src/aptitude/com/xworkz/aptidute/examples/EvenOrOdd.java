package aptitude.com.xworkz.aptidute.examples;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int x;
		Scanner sc =new Scanner(System.in);
		x=sc.nextInt();
	int r=0;
		while(x>0) {
		r=x%10;
		if(r%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}x=x/10;
		}
	}

}
