package introduction;

public class InterfaceClass implements InterfaceExercise {

	public static void main(String[] args) {
		InterfaceExercise ab =new InterfaceClass();
		ab.getData();
		ab.getMonkey();
		
		InterfaceClass abc=new InterfaceClass();
		abc.getData();
	}

	@Override
	public void getData() {
		System.out.println("This is Get Data method");
		
	}

	@Override
	public void getStatus() {
		System.out.println("This is Getstatus method");
		
	}

	@Override
	public void getMonkey() {
		System.out.println("This is Getmonkey method");
		
	}

}
