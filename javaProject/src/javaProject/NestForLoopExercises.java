package javaProject;

public class NestForLoopExercises {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println( "");
		}

	}

}
