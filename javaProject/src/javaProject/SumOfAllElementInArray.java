package javaProject;

import java.util.Scanner;

public class SumOfAllElementInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.println("How many numbers you want to sum in an array");
		int n=s.nextInt();
		Integer[] arr=new Integer[n];
		System.out.println("Enter the numbers in an array: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			
		}
		
		System.out.print(sum+" ");
		

	}

}
