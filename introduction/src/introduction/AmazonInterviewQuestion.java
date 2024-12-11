package introduction;

import java.util.ArrayList;

public class AmazonInterviewQuestion {

	public static void main(String[] args) {
		
		int[] a= {1,1,2,2,7,3,3,6,6,9,9,99};
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
					
				}
//				System.out.println(a[i]);
//				System.out.println(k);
				if(k==1) {
					System.out.println(a[i]+ " is the unique number");
				}
				
			}
			
		
		}
		

	}

}
