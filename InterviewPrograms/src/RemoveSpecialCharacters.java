
public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s="Santhosh244####";
		
		for(char c: s.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				System.out.println(c);
			}
		}
		
		String input="Santhosh";
		
		for(int i=0;i<input.length();i++) {
			System.out.println(input.charAt(i) + " ->" + (input.length()-1-i));
		}
		
		String updated="Sanjay";
		
		for(int i=0;i<updated.length();i++) {
			System.out.println(updated.charAt(i)+ "->" + (updated.length()-1-i));
		}
		
		System.out.println(Short.MAX_VALUE);

	}

}
