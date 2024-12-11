//print the pyramid triangle inverted
package introduction;

public class exercise3 {

	public static void main(String[] args) {
		int k=1;
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=0+i;j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println( "");
		}

	}

}
//Output
//1	
//1	2	
//1	2	3	
////1	2	3	4	
