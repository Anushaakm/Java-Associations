package com.xworkz.copy.things.stringMethods;

public class Palindrome {

	public static void main(String[] args) {
		String tripleRide = "Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println(tripleRide.toUpperCase());
		System.out.println(" ");
		System.out.println(tripleRide.toLowerCase());
		System.out.println(" ");

		String[] rides = tripleRide.split("");// split by space
		for (int i = 0; i < rides.length; i++) {
			System.out.println(rides[i]);
		
			System.out.println(" ");

			String[] tRide = tripleRide.split(",");// split by anything u write inside double quote " " .
			for (int tRidee = 0; tRidee < tRide.length; tRidee++) {
				System.out.println(tRide[tRidee]);
			}
				System.out.println(" ");

				char characters[] = tripleRide.toCharArray(); // String is converted to char
				for (int chars = 0; chars < characters.length; chars++) {
					System.out.println(characters[chars]);

				}

				System.out.println(" ");

				String reverse = new StringBuffer(tripleRide).reverse().toString(); // reverse
				System.out.println(reverse);

				System.out.println(" ");

				StringBuffer buffer = new StringBuffer(tripleRide);
				buffer.reverse();
				String palindrome = buffer.toString();
				if (tripleRide.equals(palindrome)) {
					System.out.println(" Movie is palindrome");
				} else {
					System.out.println(" Movie is not a palindrome");
				}

				System.out.println(" ");

				char[] chars = tripleRide.toCharArray();// find number of words
				StringBuilder digi = new StringBuilder();
				for (char j : chars) {
					if (Character.isDigit(j)) {
						digi.append(j);
					}
				}
				System.out.println(digi);
				System.out.println(" ");

			}
		

	}

}