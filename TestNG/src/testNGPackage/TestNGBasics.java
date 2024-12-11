package testNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@Test
	public void Demo(){
		System.out.println("Santhosh");
	}
	
	@Test
	public void update() {
		System.out.println("Ths is before test method");
	}
	
	@Test(groups = {"Smoke"})
	public void group2() {
		System.out.println("I will execute in groups");
	}
	
	@Test
	public void updated() {
		System.out.println("Ths is after test method");
	}

}
