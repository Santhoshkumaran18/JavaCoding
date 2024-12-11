package introduction;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		//Set interface does not accept duplicate values
		//Hashset, hashmap and linked list
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Santhosh");
		hs.add("Sanjay");
		hs.add("Srinivasan");
		hs.add("Umasankari");
		hs.add("He");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(0));
		System.out.println(hs.size());
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
