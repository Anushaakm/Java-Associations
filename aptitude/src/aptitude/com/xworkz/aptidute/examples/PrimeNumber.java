package aptitude.com.xworkz.aptidute.examples;

public class PrimeNumber {
	public static void main(String[] args) {

		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); // false
	}

	public static boolean isPrime(int n) {
		int count=0;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0 && n!=1) {
			System.out.println(n+"is prime number");
		}
		else 
			System.out.println(n+"is not prime");
		
		return true;
	}
}
