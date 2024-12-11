package introduction;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		a[0][0]=2;
		a[0][1]=3;
		a[1][0]=2;
		a[1][1]=2;
		for (int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		

	}

}
