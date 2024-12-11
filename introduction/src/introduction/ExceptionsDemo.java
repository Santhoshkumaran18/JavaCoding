package introduction;

public class ExceptionsDemo {
	
	int a=10;
	
	
	

	//try catch mechanism we can catch that error

	public static void main(String[] args) {
		int b=7;
		int c=0;
		ExceptionsDemo ed=new ExceptionsDemo();	
		try {
			int[] a= {1,2,3,4,5,6};
			System.out.println(a[7]);
			int k=b/c;
				System.out.println(k);
			
		}
			catch(ArithmeticException ets) {
					System.out.println("I catched the Arithmetic exception message");
		}
		catch (IndexOutOfBoundsException et) {
			System.out.println("I cathced the index out of bound exception");
		}
		catch (Exception e) {
			System.out.println("I handled the Exception");
		}
		finally{
			System.out.println("Delete Cookies");
			
		}
		

	}

}
