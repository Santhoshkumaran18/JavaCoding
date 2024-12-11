//Prin the pyramid triangle 
package introduction;

public class exercise2 {

	public static void main(String[] args) {
		int k = 1;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

	}

}
