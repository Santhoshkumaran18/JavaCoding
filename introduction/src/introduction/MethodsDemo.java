package introduction;

public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo d=new MethodsDemo();
		String name=d.getData();
		System.out.println(name);
		MethodsDemo2 d1=new MethodsDemo2();
		d1.getUserData();
		
		//Static method example code
		getDataUser();

	}
	
	public String getData() { //This method return nothing so we are defining void here
		System.out.println("Hello World");
		return "Rahul Shetty Academy";
	}
	
	public static void getDataUser() { //This method return nothing so we are defining void here
		System.out.println("Hello World");
	}

}
