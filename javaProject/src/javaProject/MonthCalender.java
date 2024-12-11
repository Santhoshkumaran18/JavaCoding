package javaProject;

import java.util.Scanner;

public class MonthCalender {

	
	public static void main(String[] args) throws Exception{
		try {
		System.out.println("Please Enter the Month Number: ");
		Scanner a=new Scanner(System.in);
		String[] Months= {"January","February","March","April","May","June","July","August","September","October","November","Decemeber"};
		int input=a.nextInt();
		System.out.println(Months[input-1]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
