import java.util.HashMap;
import java.util.Map;

public class NumberPrintUsingHashmap {

	public static void main(String[] args) {
		String s = "Santhosh";

		HashMap<Character, Integer> map = new HashMap<>();
		for(char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + "-> " + entry.getValue());
		}

	}

}
