package InterviewRevision;

public class StringSorting {

	public static void main(String[] args) {
		String[] s= {"ba","apple","mango"};
		
		for(String arr:s) {
			
		}
		
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-i-1;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					String temp=s[i];
					s[i]=s[j+1];
					s[j+1]=temp;
					System.out.println(s[j]);
					System.out.println(s[j+1]);
				}
				
			}
		}
		
		System.out.println("Sorted Array: ");
		
		for(String num:s) {
			System.out.println(num);
		}

	}

}
