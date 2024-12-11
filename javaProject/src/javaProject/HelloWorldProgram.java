package javaProject;

import java.util.Scanner;

public class HelloWorldProgram {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String name;
		int Age;
		System.out.println("Please enter your name :");
		name=keyboard.nextLine();
		System.out.println("Welcome to the bank: "+name);
		System.out.println("Pleas Enter you Age: ");
		Age=keyboard.nextInt();
		System.out.println("You are "+Age +" years old");
		

	}

}
