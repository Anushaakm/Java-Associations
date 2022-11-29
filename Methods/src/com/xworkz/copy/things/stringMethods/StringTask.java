package com.xworkz.copy.things.stringMethods;

public class StringTask {
	
	public static void main(String[] args) {
		String tripleRide="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		
  
        String[] arrOfStr = tripleRide.split(" ");
  
        for(int index=0;index<arrOfStr.length;index++) {
        	
        	System.out.println(arrOfStr[index]);
        }
        
        StringBuffer buffer=new StringBuffer(tripleRide);
		buffer.reverse();
		String palindrome=buffer.toString();
		if(tripleRide.equals(palindrome)) {
			System.out.println(" Movie is palindrome");
		}
		else {
			System.out.println(" Movie is not a palindrome");
		}
		

		
	}

}
