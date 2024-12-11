package introduction;

import java.util.ArrayList;

public class ArrayListExercises {
	
	//ArrayList, LinkedList and vector -> All the three classes will accept duplicate values

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		ArrayList<String> s=new ArrayList<String>();
		s.add("Santhosh");
		s.add("Java");
		for(int i=0;i<s.size();i++) {
			System.out.println(s);
		}
		System.out.println(a);
		System.out.println(s);
		s.add(0,"San");
		System.out.println(s);
		s.remove(2);
		System.out.println(s);
		s.remove("Santhosh");
		System.out.println(s);
		s.get(0);
		System.out.println(s.contains("San"));
		s.indexOf("San");
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s);
		
		
		
	}

}
