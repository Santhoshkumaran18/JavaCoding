package javaProject;

public class ExceptionHandling {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try {
			int divResult=x/y;
			System.out.println("Division of two Number result is: " + divResult);
		}catch (Exception e){
			System.out.println("Exception has been caught");
		}
		finally {
			System.out.println("I am executed Everytime");
		}
		

	}

}
