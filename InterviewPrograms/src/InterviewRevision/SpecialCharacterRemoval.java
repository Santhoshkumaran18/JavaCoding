package InterviewRevision;

public class SpecialCharacterRemoval {

	public static void main(String[] args) {
		String s = "Santhosh3847389###";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				result += c;
			}
		}
		System.out.println(result);

	}

}
