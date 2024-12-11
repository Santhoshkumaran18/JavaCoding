package javaProject;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int sum;
		boolean comparison;
		sum=a+b;
		int Diff=a-b;
		int Multiply=a*b;
		int Divide=a/b;
		int rem=a%b;
		int[] Total= {sum,Diff,Multiply,Divide,rem};
		for(int tot:Total) {
			System.out.println(tot);
		}
	  System.out.println(a<b); //Relational operators always returns boolean value
	  comparison=((a==20) &&(a==10));
	  boolean comparison1=((a==20)||(a==10));
	  System.out.println(comparison);
	  System.out.println(comparison1);
	}

}
