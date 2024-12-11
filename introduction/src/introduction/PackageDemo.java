package introduction;

public class PackageDemo {
	
	public void abc() {
		System.out.println("Hello santhosh");
	}
	
	//Default Package you can access anywhere in the package
	void santhosh() {
				System.out.println("Santhosh");
	}
	
	private void sanjay() {
		System.out.println("Hello Sanjay");
	}
	
	protected void san() {
		System.out.println("Hello san");
	}

	public static void main(String[] args) {
		String[] san= {"Sanjay","Santhosh","Srininvasan","Umasankari"};
		System.out.println(san.length);
		PackageDemo pd=new PackageDemo();
		pd.sanjay();
	
		}
	

}
