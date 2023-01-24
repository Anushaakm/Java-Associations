package aptitude.com.xworkz.aptidute.examples;

public class ArraySum {

		 
	    public static void main(String[] args) {      
	          
	        int[] a={1, 2, 3, 4, 5};   
	        int sum = 0;
	        
	        String ref="abcd";  
	          
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i < a.length; i++) {   
	           sum = sum + a[i];  
	        }    
	        System.out.println("Sum of all the elements of an array: " + sum);  
	    }  
	}  
