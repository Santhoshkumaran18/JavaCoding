package javaProject;

public class AlphabetPatternExercises2 {

	public static void main(String[] args) {
		int alphabet=65;
		System.out.println("****Printing the Pattern ****");
		for(int i=0;i<=4;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print((char)(alphabet)+"");
				System.out.print("\t");
			}
			alphabet++;
			System.out.println();
		}
	}

}

/* Output
A	
B	B	
C	C	C	
D	D	D	D	
E	E	E	E	E	
*/