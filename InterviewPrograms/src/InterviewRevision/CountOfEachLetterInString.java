package InterviewRevision;

public class CountOfEachLetterInString {

	public static void main(String[] args) {
		String s="SANTHOSHKumaran";
		
		String lcinput=s.toLowerCase();
		
		int[] n=new int[26];
		
		for(char c: lcinput.toCharArray()) {
			if(Character.isLetter(c)) {
				n[c-'a']++;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(n[i]>0) {
				System.out.println((char)(i+'a') + "-> " + n[i]);
			}
		}
 
	}

}
