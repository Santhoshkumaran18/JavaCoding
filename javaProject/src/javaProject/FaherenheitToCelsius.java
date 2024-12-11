package javaProject;

import java.util.Scanner;

public class FaherenheitToCelsius {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int celsiusStart,celsiusEnd;
		System.out.println("Please enter the Starting value of celsius: ");
		celsiusStart=a.nextInt();
		System.out.println("Please enter the celsius End value: ");
		celsiusEnd=a.nextInt();
		System.out.println("CELSIUS      FAHERNHEIT");
		for(int i=celsiusStart;i<=celsiusEnd;i++) {
			System.out.print(i + "            ");
			float faherenheit=i*9/5+32;
			System.out.println(faherenheit);
		}
	}

}
