package introduction;

public class SuperChildDemo extends SuperParentDemo {
	String name="Sanjay";
	public void getString() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public SuperChildDemo() {
		super();
		System.out.println("I am in the childclass constructor");
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		SuperChildDemo cd=new SuperChildDemo();
		cd.getString(); //It gives preference to the childclass variables
		cd.getData();
		

	}

}
