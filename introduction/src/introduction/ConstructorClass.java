package introduction;

public class ConstructorClass {
	//Default Constructor
	public ConstructorClass() {
		System.out.println("I am in the constructor class");
	}
	public void getData() {
		System.out.println("I am the method");
	}
	//parameterized constructor
	public ConstructorClass(int a,int b) {
		System.out.println("I am in the parameterized constructor");
	}
	public ConstructorClass(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		ConstructorClass cc=new ConstructorClass("Santhosh");
		//compiler will call implicit constructor if we not define any 
		//constructor block
		ConstructorClass d=new ConstructorClass(4,5);
	}

}
