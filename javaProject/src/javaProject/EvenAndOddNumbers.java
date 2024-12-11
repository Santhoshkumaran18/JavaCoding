package javaProject;

import java.util.Scanner;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int b,c,d,e;
		b=a.nextInt();
		if(b%2==0) {
			System.out.println(b+ " is an Even Number");
		}else {
			System.out.println("It is an odd Number");
		}
	}

}
