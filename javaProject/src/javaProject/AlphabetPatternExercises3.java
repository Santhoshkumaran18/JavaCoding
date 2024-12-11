package javaProject;

public class AlphabetPatternExercises3 {

	public static void main(String[] args) {
		int alphabet=65;
		System.out.println("****Printing the Pattern ****");
		for(int i=0;i<=3;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j)+"");
				System.out.print("\t");
			}
			System.out.println();
		}
		for(int i=3;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print((char)(alphabet+j-1)+"");
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}


