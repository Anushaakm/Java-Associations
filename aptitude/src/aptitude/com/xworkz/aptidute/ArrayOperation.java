package aptitude.com.xworkz.aptidute;

public class ArrayOperation {

	public static int findPeak(int[] arr, int n) {
		// check for first and last index value
		if (n == 0) {
			return 0;
		}
		// for first element
		else if (arr[0] >= arr[1]) {
			return 0;
		}
		// for last element
		else if (arr[n - 1] >= arr[n - 2]) {
			return n - 1;
		}
		
		//for every other elements
		for(int i=1;i<n-1;i++) 
		{
			if(arr[i]>=arr[n-1] && arr[i]>=arr[n+1]) {
				return i;
			}
		}

		return 0;

	}

	public static void main(String[] args) {
		 int arr[] = { 1, 3, 20, 4, 1, 0 };
		int n=arr.length;
		System.out.println(findPeak(arr, n));
	}

}
