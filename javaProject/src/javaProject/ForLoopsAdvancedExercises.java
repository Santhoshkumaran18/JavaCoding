package javaProject;

import java.util.Scanner;

public class ForLoopsAdvancedExercises {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the numbers you want between");
		int numberStart=a.nextInt();
		int numberEnd=a.nextInt();
		for (int i=numberStart;i<=numberEnd;i++) {
			System.out.print(i+"  ");
			
		}
		System.out.println("\t");
		for(int j=numberEnd;j>=numberStart;j--) {
			System.out.print(j + "  ");
		
		
		}
		
		

	}
	
}


