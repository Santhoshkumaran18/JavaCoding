package InterviewRevision;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args) {
		Integer[] a= {2,3,4,6,67,-1,458475};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-1]);
		System.out.println(a[0]);
		
		System.out.println((a[0]+ a[a.length-1]));
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
		System.out.println(a.length-1);
		System.out.println(a[a.length-1]);
		System.out.println(a[0]);
		

	}

}
