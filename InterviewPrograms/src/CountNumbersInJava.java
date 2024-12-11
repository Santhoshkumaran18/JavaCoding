import java.util.HashMap;
import java.util.Map;

public class CountNumbersInJava {

	public static void main(String[] args) {
		String input = "different";
		HashMap<Character,Integer> s=new HashMap<>();
		for(char c: input.toCharArray()) {
			s.put(c, s.getOrDefault(c,0)+1);
			System.out.println(c);
		}
		
	
				
		// Print each character and its count
        for (Map.Entry<Character, Integer> entry : s.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }	

	}
	}


