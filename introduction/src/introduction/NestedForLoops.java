package introduction;

public class NestedForLoops {

	public static void main(String[] args) {
		for (int i=0;i<=5;i++) { //Outer for loop cannot come once the inner loop is getting finished
			for (int j=0;j<=4;j++) {
				System.out.println("Inner Loop finished");
				
			}
			System.out.println("Outer Loop finished");
		}

	}

}
