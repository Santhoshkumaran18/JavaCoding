package introduction;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExercises {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Santhosh");
		hm.put(1, "Sanjay");
		hm.put(2, "Srinivasan");
		hm.put(3, "Umasankar");
		System.out.println(hm);
		System.out.println(hm.get(2));
		Set sm=hm.entrySet();
		Iterator sn=sm.iterator();
		while (sn.hasNext()) {
			Map.Entry mp=(Map.Entry)sn.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
