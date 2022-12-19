package aptitude.com.xworkz.aptidute.example2;

import java.util.Scanner;

public class TRprogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			int num = i;
			int temp = num;
			// System.out.println(temp);
			int count = 0;
			for (; temp != 0; temp = temp / 10) {
				count++;
			}
			int n = temp;
			int lastDigit = 0;
			int sum = 0;
			for (; n > 0; n = n / 10) {
				lastDigit = n % 10;
				sum += (int) Math.pow(lastDigit, count);
				count--;
			}
			if (num == sum) {
				System.out.println(num);
			}
		}
	}
}
