package introduction;


public class NumberReverseMethods {

	public static void main(String[] args) {
		int[] number= {99,25,27,28,999};
		for(int i=number.length-1;i>=0;i--) {
			System.out.println(number[i]);
		}
		int x=0;
		for(int i=0;i<=number.length;i++) {
			if(number[i]>x) {
				int temp=number[i];
				System.out.println(temp);
			}
		}

	}

}
