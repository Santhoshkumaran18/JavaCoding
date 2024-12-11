package javaProject;

import java.util.Scanner;

public class OperatorsExercises {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int number1=10;
		int number2=20;
		int sum=number1+number2;
		int difference=number1-number2;
		int multiply= number2*number1;
		int division=number2/number1;
		int modulues=number1%number2;
		int[] Operators= {sum,difference,multiply,division,modulues};
		for(int oper:Operators) {
			System.out.println(oper);
		}
		
		
		

	}

}
