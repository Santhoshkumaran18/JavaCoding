package javaProject;

import java.util.Scanner;

public class BMIcalculator {
	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		String Name;
		float Weight,height;
		System.out.println("Please Enter you Name: ");
		Name=a.nextLine();
		System.out.println("Please Enter your Weight(in Kg): ");
		Weight=a.nextFloat();
		System.out.println("Please Enter your height(in m): ");
		height=a.nextFloat();
		float BMI;
		BMI=Weight/(height*height);
		System.out.println("BMI of "+Name +" is "+ BMI);
		if(BMI > 30) {
			System.out.print(Name +" is moderatedly obese");
		}else if(BMI <30) {
			System.out.println("Normal");
		}else {
			System.out.println("Need to check");
		}
		
	}
}
