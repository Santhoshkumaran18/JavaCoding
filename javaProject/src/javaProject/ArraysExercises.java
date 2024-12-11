package javaProject;

import java.util.Scanner;

public class ArraysExercises {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter how many names you want to print: ");
		int Names=s.nextInt();
		String[] names=new String[Names];
		System.out.println("Please enter each of the employee name: ");
		for(int i=0;i<=Names;i++) {
			names[i]=s.nextLine();	
		}
		for(int j=0;j<=Names;j++) {
			System.out.println(names[j]);
		}
	}

}
