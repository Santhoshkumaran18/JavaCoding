package introduction;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import org.w3c.dom.html.HTMLTableColElement;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the how many numbers you want to print");
//		int  a =s.nextInt();
		Integer[] a = { 4, 2, -1, 1 };
		String[] b = { "Santhosh", "AAA", "ABC", "AAA" };
//		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] >a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-1]);
		

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

		Arrays.sort(b);
		System.out.println("After Sorting: " + Arrays.toString(b));
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
	}

}
