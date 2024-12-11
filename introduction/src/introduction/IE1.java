package introduction;

public class IE1 implements Santhosh {
	public static void main(String[]args) {
		Santhosh s=new IE1();
		s.santhosh();
		s.sanjay();
		s.dad();
		s.Mom();
	}

	@Override
	public void santhosh() {
		System.out.println("This is Santhosh Kumaran");
		
	}

	@Override
	public void sanjay() {
		System.out.println("This is Sanjay Kumaran");
		
	}

	@Override
	public void Mom() {
		System.out.println("This is Mom");
		
	}

	@Override
	public void dad() {
		System.out.println("This is Dad");
		
	}
	
}
