package aptitude.com.xworkz.aptidute.onCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicates {

	
		public static void main(String[] args) {

			// Make the two lists
			//List<Integer> list1 = Arrays.asList(2,5,4,9,11);
			//List<Integer> list2 = Arrays.asList(14,12,5,4,6);
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==m) {
				System.out.println("Length of two list must be different");
				return;
			}
			List<Integer> list1 = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				list1.add(sc.nextInt());
			}
			List<Integer> list2 =new ArrayList<Integer>();
			for(int i=0;i<m;i++) {
				list2.add(sc.nextInt());
			}
			
			
			
			// Prepare a union
			Set<Integer> union = new HashSet<Integer>(list1);
			union.addAll(list2);
			// Prepare an intersection
			Set<Integer> remove = new HashSet<Integer>(list1);
			remove.retainAll(list2);
			// Subtract the intersection from the union
			union.removeAll(remove);
			// Print the result
			
				System.out.println(union.size());
			
			
			
		}
	}


