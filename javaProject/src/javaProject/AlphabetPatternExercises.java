package javaProject;

public class AlphabetPatternExercises {

	public static void main(String[] args) {
		int alphabet=65;
		System.out.println("****Printing the Pattern ****");
		for(int i=0;i<=6;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print((char)(alphabet)+"");
				System.out.print("\t");
				alphabet++;
			}
			System.out.println();
		}
	}

}

/* Output
A	
B	C	
D	E	F	
G	H	I	J	
K	L	M	N	O	
P	Q	R	S	T	U	
V	W	X	Y	Z	[	\	
*/