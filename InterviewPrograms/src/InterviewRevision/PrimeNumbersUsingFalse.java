package InterviewRevision;

import java.util.Scanner;

public class PrimeNumbersUsingFalse {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		if(isPrimeNumber(number)) {
			System.out.println(number + " is the prime number");
		}else {
			System.out.println(number + "is not a prime number" );
			
		}
		
	
	}
	
	public static boolean isPrimeNumber(int num) {
		if(num<1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num %i==0) {
				return false;
			}
		}
		return true;
	}

}
