package javaProject;

import java.util.Scanner;

public class BirthYear {

	public static void main(String[] args) {
		int birthYear;
		int currentYear=2024;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your birth year: ");
		birthYear=a.nextInt();
		int CurrentAge=currentYear-birthYear;
		System.out.println("Your Current Age is "+ CurrentAge);
		

	}

}
