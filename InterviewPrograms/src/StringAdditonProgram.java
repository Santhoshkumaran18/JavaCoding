
public class StringAdditonProgram {

	public static void main(String[] args) {
		String s="dshflk1234567";
		int sum=0;
		for(char c: s.toCharArray()) {
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
			
		}
		System.out.println(sum);

		}

	}

