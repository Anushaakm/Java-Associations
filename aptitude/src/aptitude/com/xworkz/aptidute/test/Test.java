package aptitude.com.xworkz.aptidute.test;

public class Test {
	
		  
	    // Main driver method
	    public static void main(String args[])
	    {
	        // Custom input string
	        String str = "909.787.987";
	        String[] arrOfStr = str.split("[.]");
	        for(int i=0;i<arrOfStr.length;i++) {
	        	
	        	//System.out.println(arrOfStr[i]);
	        	
	        	if(arrOfStr.length<=4) {
	        		System.out.println(arrOfStr[i]);
	        		
	        	}
	        }
	        
	        
	       // for (String a : arrOfStr)
	        //    System.out.println(a);
	    }
	}

