package aptitude.com.xworkz.aptidute.examples;

public class productOfNumberByArray {

	public static void main(String[] args) {
		
		int givenArray[] = { 1,2,3,4,5,6,7,8,9 };
		
		for (int i = 0; i < givenArray.length; i++) {
			
			int three=givenArray[i]*3;
            System.out.print(three+ " ");
        }
		
		  System.out.println("");
		 for(int i = 0; i < givenArray.length; i++){
			  
	            int six=givenArray[i]*6;
	            System.out.print(six+ " ");
		 }
	}

}
