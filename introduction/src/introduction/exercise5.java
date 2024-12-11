package introduction;

public class exercise5 {

	public static void main(String[] args) {
		int k=3;
		for (int i=0;i<=9;i+=3) {
			for(int j=3;j<=3+i;j+=3) {
				System.out.print(k);
				System.out.print("\t");
				k+=3;
			}
			System.out.println( "");
		}

	}

}

//Output
//3	
//6	9	
//12	15	18	
//21	24	27	30	
