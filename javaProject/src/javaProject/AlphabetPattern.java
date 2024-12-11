package javaProject;

public class AlphabetPattern {

	public static void main(String[] args) {
		int alphabet=65;
		System.out.println("****Printing the Pattern ****");
		for(int i=0;i<=10;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j)+"");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}

/* Output
A	
A	B	
A	B	C	
A	B	C	D	
A	B	C	D	E	
A	B	C	D	E	F	
*/