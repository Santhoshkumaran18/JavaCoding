package InterviewRevision;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s="Delloite$$%%";
		StringBuilder result=new StringBuilder();
		
		for(char c:s.toCharArray()) {
			if(Character.isLetter(c)) {
				result.append(c);
			}
		}
		
		System.out.println("String after removing the characters: " + result.toString());
		
		

	}

}
