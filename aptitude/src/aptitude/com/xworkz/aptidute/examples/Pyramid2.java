package aptitude.com.xworkz.aptidute.examples;

public class Pyramid2 {
public static void main(String[] args) {
	System.out.println("mirror img of right angle triangle");
	int n=4;
	
	//for rows  i=rows and k= column
	for(int i=1;i<=n;i++) {
		//for space
		for(int j=n-1;j>=i;j--) {
			System.out.print(" ");
		}
		//for char
		for(int k=1; k<=i;k++) {
			System.out.print("@");
		}
		//for getting it in nxt line
		System.out.println("");
	}


System.out.println("eqilataral triangle img of right angle triangle");
int a=4;

//for rows
for(int i=1;i<=a;i++) {
	//for space
	for(int j=a-1;j>=i;j--) {
		System.out.print(" ");
	}
	//for char add space to get equilataral
	for(int k=1; k<=i;k++) {
		System.out.print("@ ");
	}
	//for getting it in nxt line
	System.out.println("");
}

System.out.println("print rows like 1,22,333 triangle img of right angle triangle");
int b=4;

//for rows
for(int i=1;i<=b;i++) {
	//for space
	for(int j=a-1;j>=i;j--) {
		System.out.print(" ");
	}
	//for char add space to get equilataral
	for(int k=1; k<=i;k++) {
		System.out.print(i);
	}
	//for getting it in nxt line
	System.out.println("");
}

System.out.println("print rows like 1,12,123 triangle img of right angle triangle");
int c=4;

//for rows
for(int i=1;i<=c;i++) {
	//for space
	for(int j=a-1;j>=i;j--) {
		System.out.print(" ");
	}
	//for char add space to get equilataral
	for(int k=1; k<=i;k++) {
			System.out.print(k);
	}
	//for getting it in nxt line
	System.out.println("");
}

System.out.println("print 2 as Anusha triangle img of right angle triangle");
int d=4;

//for rows
for(int i=1;i<=d;i++) {
	//for space
	for(int j=d-1;j>=i;j--) {
		if(j==2) {
		System.out.print("Anu");
		}
		else {
			System.out.print(j);
		}
	}
	//for char and add space to get equilataral
	for(int k=1; k<=i;k++) {
		if(k==2) {
			System.out.print("Anu");
		}
		else {
		System.out.print(k);
		}
	}
	
	//for getting it in nxt line
	System.out.println("");
}

System.out.println("Revese img of right angle triangle");
int n1=4;

//for rows  i=rows and k= column
for(int i=n1;i>=1;i--) {
	//for space
	for(int j=n1-1;j>=i;j--) {
		System.out.print(" ");
	}
	//for char
	for(int k=1; k<=i;k++) {
		System.out.print("@");
	}
	//for getting it in nxt line
	System.out.println("");
}

System.out.println("Revese img of right angle triangle");
int n2=4;

//for rows  i=rows and k= column
for(int i=n2;i>=1;i--) {
	//for space
	for(int j=n2-1;j>=i;j--) {
		System.out.print(" ");
	}
	//for char
	for(int k=1; k<=i;k++) {
		System.out.print("@ ");
	}
	//for getting it in nxt line
	System.out.println("");
}

}
}
