package aptitude.com.xworkz.aptidute.examples;

import java.util.Scanner;

public class Remove_whiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(), str2="";
		char[] ch=str.toCharArray();
		 
		for(int i=0;i<ch.length;i++) {
			if(str.charAt(i)==' ') {
				continue;
			}else {
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
	}

}
