package aptitude.com.xworkz.aptidute.ImpLogic;

import java.util.Scanner;

public class BubbleSort {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraysize = sc.nextInt();
		int arr[] = new int[arraysize];
		for (int i = 0; i < arraysize; i++) {
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);// sorting array elements using bubble sort

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}