package javaProject;

import java.util.Scanner;

public class NameInputs {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		String starts="S";
		System.out.println("Please Enter you Name in capital letters :");
		String b=a.nextLine();
		if(b.startsWith(starts)) {
			System.out.println("Entered Name is: " +b);
		}else {
			System.out.println("Please enter the name starting with letter S");
		}
		

	}

}
