package InterviewRevision;

import java.util.Arrays;
import java.util.*;

public class StringRvse {
	
	public static void main(String[] args) {
		String[] s= {"Sanjya","Abc"};
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Santhosh");
		list.add("Sanjay");
		list.add("Umasankari");
		
		for(String num:list) {
			System.out.print("\n" + num + " ");
		}
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.max(list));
		
		
		
		HashSet<String> set=new HashSet<>();
		set.add("Santhosh");
		set.add("Sanjya");
		
		for(String num1:set) {
			System.out.println(num1);
		}
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
