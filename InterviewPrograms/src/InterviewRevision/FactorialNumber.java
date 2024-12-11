package InterviewRevision;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		if(n<0) {
			System.out.println("Factorial is not for negative numbers");
		}else {
			long factorial=1;
			for(int i=1;i<=n;i++) {
				factorial*=i;
			}
			System.out.println(factorial);
		}

	}

}
