package testNGPackage;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void MobileSignIn() {
		System.out.println("This is Login module");
	}
	
	@Test
	public void MobileLogin() {
		System.out.println("This is Mobile Login");
	}
	
	@Test(groups = {"Smoke"})
	public void group3() {
		System.out.println("I will execute in groups");
	}
	
	@Test
	public void MobileSignout() {
		System.out.println("This is Car Loan");
	}
}
