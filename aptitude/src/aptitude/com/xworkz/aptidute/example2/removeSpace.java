package aptitude.com.xworkz.aptidute.example2;

public class removeSpace {

	public static void main(String[] args) {
		String str="Hands on learning happens here";
		String str2="";
		
		int count=0;
		
		
		for(char ch:str.toCharArray()) {
			if(ch=='l'&&ch=='e'&&ch=='a')
	         str2 = ch+str2; //adds each character in front of the existing string
	        System.out.println("Reversed word: "+ ch);
		}
		System.out.println("white space"+count);
		System.out.println(str2);
		
	}

}
