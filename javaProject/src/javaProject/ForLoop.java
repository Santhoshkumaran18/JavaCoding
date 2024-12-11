package javaProject;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("Please enter two Number to compare : ");
		Scanner a=new Scanner(System.in);
		int num1=a.nextInt();
		int num2=a.nextInt();
		if(num1>num2) {
			System.out.println("Number 1 is greater than Number 2");
		}else if (num1<num2) {
			System.out.println("Number 2 is greater than Number 1");
		}else {
			System.out.println("Both the numbers are equal");
		}

		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}


	}
	}
