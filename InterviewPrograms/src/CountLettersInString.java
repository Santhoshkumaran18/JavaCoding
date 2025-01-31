import java.util.HashMap;
import java.util.Map;

public class CountLettersInString {

	public static void main(String[] args) {
		String input="Dashing Caaars";
		
		Map<Character,Integer> s=new HashMap<>();
		for(char c: input.toCharArray()) {
			s.put(c, s.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry: s.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}

}
