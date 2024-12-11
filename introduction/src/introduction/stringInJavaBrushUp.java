package introduction;

public class stringInJavaBrushUp {

	public static void main(String[] args) {
		String s="Rahul Shetty Academy";
		
		String s1= new String("Rahul Shetty Academy");
		String[] spllitedString=s1.split(" "); //If we give space as a delimtter it'll split into three index
		System.out.println(spllitedString[0]);
		System.out.println(spllitedString[1]);
		System.out.println(spllitedString[2]);
		
		String s2= new String("Rahul Shetty Academy");
		String[] splitedStringnew=s2.split("Shetty");
		System.out.println(splitedStringnew[0]);
		System.out.println(splitedStringnew[1]);
		System.out.println(splitedStringnew[1].trim());
		
		for(int i=0;i<s2.length();i++) {
			 System.out.println(s2.charAt(i));
		}
		
		for(int i=s2.length()-1;i>=0;i--) {
			 System.out.println(s2.charAt(i));
		}

	}

}
