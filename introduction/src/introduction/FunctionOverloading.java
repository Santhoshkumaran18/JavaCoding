package introduction;
//Function overloading is nothing but Same class have multiple methods with same name
//Either the arguments count should be different or argument datatype should be different
public class FunctionOverloading {

	public void getData(int a) {
		System.out.println(a);

	}

	public void getData(String a) {
		System.out.println(a);

	}

	public static void main(String[] args) {
		FunctionOverloading f=new FunctionOverloading();
		f.getData(0);
		f.getData("Santhosh");
	}

}
