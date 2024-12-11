package introduction;

public class childEmirates extends PublicAirCraft{

	public static void main(String[] args) {
		childEmirates ch=new childEmirates();
		ch.bodycolour();
		ch.engine();
		ch.safetyGuidelines();

	}

	@Override
	public void bodycolour() {
		System.out.println("Red colour on the body");
		
	}

}
