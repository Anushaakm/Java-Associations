package aptitude.com.xworkz.aptidute.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Football {
	
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        if (n <= 5) {
	            System.out.println("Number of employees must be greater than 5");
	            return;
	        }
	        List<Integer> football = new ArrayList<>();
	        List<Integer> basketball = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            int id = sc.nextInt();
	            if (id % 4 == 0) {
	                football.add(id);
	            } else {
	                basketball.add(id);
	            }
	        }
	        System.out.print("List of employees in football team are: ");
	        for (int i = 0; i < football.size(); i++) {
	            System.out.print(football.get(i) + " ");
	        }
	        System.out.println();
	        System.out.print("List of employees in basketball team are: ");
	        for (int i = 0; i < basketball.size(); i++) {
	            System.out.print(basketball.get(i) + " ");
	        }
		

	}

}
