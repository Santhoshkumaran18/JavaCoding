package javaProject;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_number {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Print how many number you want in the array");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the numbers in the array");
			arr[i]=scan.nextInt();
		}
				for(int i=0;i<n;i++) {
					for(int j=i+1;j<n;j++) {
						if(arr[i]>arr[j]) {
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
				for(int i=0;i<n;i++) {
					System.out.print(arr[i]+" ");
				}
				
		System.out.println("\n"+arr[n-2]);

	}

}
