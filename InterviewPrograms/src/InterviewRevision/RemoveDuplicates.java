package InterviewRevision;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] number= {1,2,43,4,5,5,6,7,7,87,8};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int numbers:number) {
			set.add(numbers);
		}
		
		int[] result=new int[set.size()];
		int index=0;
		for (int number1 : set) {
			result[index++] = number1;
        }
		System.out.println(result);
		
		
		

	}

}
