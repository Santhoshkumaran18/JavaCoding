package introduction;

public class StringReverseExercises {

	public static void main(String[] args) {
		String input="Test Automation";
		String reversed=new StringBuilder(input).reverse().toString();
		
		System.out.println("The reversed string is:" + reversed);
		String reversedNew="";
		for(int i=input.length()-1;i>=0;i--) {
			reversedNew+=input.charAt(i);
		}
		System.out.println(reversedNew);
		

	}

}
