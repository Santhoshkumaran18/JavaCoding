package javaProject;

import java.util.ArrayList;
import java.util.Collections;

public class Sanjay {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Sanjay Loosu");
		arr.add("Azhagu");
		Collections.sort(arr);
		for(String order:arr) {
			System.out.print(order + " ");
			
		}
		System.out.println(arr.size());
		

	}

}
