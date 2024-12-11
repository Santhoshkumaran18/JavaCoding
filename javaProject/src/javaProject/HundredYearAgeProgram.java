package javaProject;

import java.util.Scanner;

public class HundredYearAgeProgram {

	public static void main(String[] args) {
		int Age;
		Scanner a = new Scanner(System.in);

		System.out.println("Please Enter your Age: ");
		Age = a.nextInt();
		System.out.println("Please Enter your BirthYear: ");
		int birthYear = a.nextInt();
		int hundredYears = birthYear + 100;
		System.out.println("You will be 100 years old in:" + hundredYears);

	}

}
