package introduction;

import java.util.Scanner;

public class LargestFromThreeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many elements you need to in the array");
		int n=s.nextInt();
		int[] number= new int[n];
		System.out.println("Given the elements in the array");
		for(int i=0;i<n;i++) {
			number[i]=s.nextInt();
		}
		int largest=number[0];
		
		for(int i=1;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
			
		}
		System.out.println("The largest number in the given number: " + largest);
		
		}
}


