package InterviewRevision;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int first=0,Second=1;
		for(int i=1;i<=n;i++) {
			System.out.println(first + " ");
			int next=first+Second;
			first=Second;
			Second=next;
		}
	}

}
