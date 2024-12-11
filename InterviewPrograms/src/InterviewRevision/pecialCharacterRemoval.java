package InterviewRevision;

public class pecialCharacterRemoval {

	public static void main(String[] args) {
		String s="Santhosh235905##";
		int sum=0;
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		System.out.println(sum);
		
		String result=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(result);
		
		StringBuilder san=new StringBuilder();
		for(char c: s.toCharArray()) {
			if(Character.isLetter(c)) {
				san.append(c);
			}
		}
		System.out.println(san);
		
		String result1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c >='a' && c<='z' || c>='A' && c<='Z')) {
				result1+=c;
			}
		}
		System.out.println(result1);

	}

}
