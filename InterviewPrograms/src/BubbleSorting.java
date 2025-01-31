import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSorting {

	public static void main(String[] args) {
		Integer[] a= {1,2,43,5,-3343,-34983};
		Arrays.sort(a);
		System.out.println("Sorting in ascending order: " +Arrays.toString(a));
		System.out.println("Larget number in the array: " + a[a.length-1]);
		System.out.println("Smallest number in the array: " + a[0]);
		
		ArrayList<Integer> ab=new ArrayList<>();
		ab.add(25);
		ab.add(50);
		ab.add(75);
		Collections.sort(ab);
		System.out.println(Collections.max(ab));
		System.out.println(Collections.min(ab));
		System.out.println(ab);
		
		
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
		System.out.println(a[a.length-1]);

	}

}
