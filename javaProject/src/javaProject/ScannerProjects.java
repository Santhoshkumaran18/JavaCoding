package javaProject;

import java.util.Scanner;

public class ScannerProjects {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		float pounds;
		System.out.println("Please enter you INR to convert: ");
		pounds=a.nextFloat();
		float conversionRate=108.73f;
		float rupees= conversionRate*pounds;
		System.out.println("Conversion of INR to pounds is "+rupees);

	}

}
