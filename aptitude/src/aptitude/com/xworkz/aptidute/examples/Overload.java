package aptitude.com.xworkz.aptidute.examples;

public class Overload {

	public int a;
	public int b;
	public int c;
	 public int doSum(int a,int b) 
	{
		 int c=a+b;
		 System.out.println(c);
		 return c;
    }
  public float doSum(float a, float b)
   {
	   float c=a+b;
	   System.out.println(c);
	   return c; 
   }
  public static void main(String[] args) {
		
		Overload overload=new Overload();
		
		overload.doSum(2,3);
		overload.doSum(2.5f,3.5f);
		
	}
}


