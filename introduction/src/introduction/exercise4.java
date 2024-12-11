package introduction;

public class exercise4 {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++) {
			for(int j=1;j<=1+i;j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println( "");
		}

	}

}

//*Output

//1
//1 2
//1 2 3 
//1 2 3 4
