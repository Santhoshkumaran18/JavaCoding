package introduction;

//It is an agreement and we have to implement all the methods so if we define in the interface and we should
//implet in the class

public class australianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		CentralTraffic a =new australianTraffic();
		a.greenGo();
		a.flashYellow();
		a.redStop();
		australianTraffic at=new australianTraffic();
		ContinentalTraffic ct=new australianTraffic();
		at.walkOnSymbol();
		
		
	}

	@Override
	public void greenGo() {
		System.out.println("Green Stop Implementation");
		
	}
	
	public void walkOnSymbol() {
	}

	@Override
	public void redStop() {
		System.out.println("Red Stop Implementation");
		
	}

	@Override
	public void flashYellow() {
		System.out.println("Yellow Stop Implementation");
		
	}

	@Override
	public void TrafficSymbol() {
		// TODO Auto-generated method stub
		
	}

}
