package InterviewRevision;

import java.util.*;

public class ArrayToString {

	public static void main(String[] args) {
		String[] arr= {"Santhosh","Sanjay"};
		List<String> list=Arrays.asList(arr);
		
		System.out.println(list);
		
		ArrayList<String> arr1=new ArrayList<>();
		arr1.add("AAA");
		arr1.add("BBB");
		
		String[] array=list.toArray(new String[0]);
		for (String num:array) {
			System.out.println(num);
		}
		

	}

}
