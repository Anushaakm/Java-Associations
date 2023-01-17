package com.xworkz.devsir;

import java.util.Arrays;
import java.util.Scanner;

public class Fan {

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		// Long l=sc.nextLong();

		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		try {
			arr[7] = 8;
			arr[8] = 9;

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("check Array size");
		}

		try {
			String str = null;
			System.out.println(str.charAt(2));
		} catch (NullPointerException e) {
			System.out.println("Do null check");
		}

		System.out.println(Arrays.toString(arr));

	}

}
