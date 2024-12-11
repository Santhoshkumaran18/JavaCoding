
public class NumberPrintUsingForLoop {

	public static void main(String[] args) {
		String s="Saaanthooosh";
		
		String input=s.toLowerCase();
		
		int[] a=new int[26];
		
		for(char c:input.toCharArray()) {
			if(Character.isLetter(c)) {
				a[c-'a']++;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(a[i]>0) {
				System.out.println((char)(i+'a')+ "->" + a[i]);
			}
		}
	}

}
