package testNGPackage;

import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis() {
		System.out.println("I am in parent class");
	}
	
	@BeforeMethod
	public void runmefirst() {
		System.out.println("Run me first");
	}

}
