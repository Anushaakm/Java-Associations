package aptitude.com.xworkz.aptidute.test;

import java.util.HashSet;
import java.util.Scanner;

public class NonCommon {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();

	        if (n == m) {
	            System.out.println("Length of two lists must be different");
	            sc.close();
	            return;
	        }

	        HashSet<Integer> set1 = new HashSet<Integer>();
	        for (int i = 0; i < n; i++) {
	            set1.add(sc.nextInt());
	        }

	        HashSet<Integer> set2 = new HashSet<Integer>();
	        for (int i = 0; i < m; i++) {
	            set2.add(sc.nextInt());
	        }
	        

	        set1.addAll(set2);
	        
	        System.out.println(set1.size());
	    }
	}

