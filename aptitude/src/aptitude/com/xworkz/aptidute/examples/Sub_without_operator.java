package aptitude.com.xworkz.aptidute.examples;

public class Sub_without_operator {

	
	static int sub(int a,int b) {
		for(int i=1;i<=b;i++)
			a-- ;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = sub(100, 32);
		 System.out.println(a);

	}

}
