import java.util.Collections;

public class StringReverseFunction {

	public static void main(String[] args) {
		String s = "Santhosh";
		StringBuilder san = new StringBuilder(s);
		System.out.println(san.reverse());
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		System.out.println(reversed);

	}

}
