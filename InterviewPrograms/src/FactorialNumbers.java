
public class FactorialNumbers {

	public static void main(String[] args) {
		int n=5;
		
		if(n<0) {
			System.out.println("Factorial of the numbers is negative numbers");
		}else {
			long factorial=1;
			for(int i=1;i<=n;i++) {
				factorial*=i;
			}
			System.out.println(factorial);
		}

	}

}
