package javaProject;

import java.util.Calendar;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Please Enter the month number");
		int MonthsNumber;
		MonthsNumber=a.nextInt();
		switch(MonthsNumber) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
		}
	}

}
