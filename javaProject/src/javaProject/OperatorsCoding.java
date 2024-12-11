package javaProject;

import java.util.Scanner;

public class OperatorsCoding {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Please Enter two numbers to compare: ");
		float b = a.nextFloat();
		float c = a.nextFloat();
		float sum = b + c;
		System.out.println("Sum of Two Numbers: " + sum);
		boolean twoNumberCheck = b == c;
		if (twoNumberCheck == true) {
			System.out.println("Two Numbers you have entered are equal");
		}else {
			System.out.println("Two numbers you have entered is not equal");
		}

	}

}
