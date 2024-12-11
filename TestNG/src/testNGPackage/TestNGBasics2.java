package testNGPackage;

import javax.swing.plaf.synth.SynthToggleButtonUI;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGBasics2 {

	@Test
	public void Day3() {
		System.out.println("I will execute last");
	}
	
	@Test(groups = {"Smoke"})
	public void group1() {
		System.out.println("I will execute in groups");
	}
	
	@BeforeClass
	public void beforeExecuting() {
		System.out.println("Before executing the class");
	}
	
	@AfterClass
	public void beforeExecuting1() {
		System.out.println("After executing all the class");
	}
	
	@BeforeSuite
	public void Day4() {
		System.out.println("I will execute before the first test and suite method");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("I will execute before each of the method in day3 class");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("I will execute after each of the method in day3 class");
	}
	
	@AfterSuite
	public void Day5() {
		System.out.println("I will execute before the last test and suite method");
	}
	
	@Test
	public void Day2() {
		System.out.println("This is Day2");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("This is first test method");
	}
	@Parameters({"Santhosh","Sanjay"})
	@Test
	public void API(String urlname,String key) {
		System.out.println("This is due to alphabet skipping");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(enabled = true)
	public void BC() {
		System.out.println("This is due to enabled checking");
	}
	
	@Test(timeOut = 4000)
	public void BCd() {
		System.out.println("This is due to enabled checking");
	}
	
//	@Test(dependsOnMethods = {"API"})
//	public void AAA() {
//		System.out.println("This is first alphabet checking");
//	}
	
	@Test(dataProvider = "getData")
	public void AAAb(String Username,String password) {
		System.out.println("This is first alphabet checking");
		System.out.println(Username + password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st Combination Username and password
		//2nd Combination username and credit history
		Object[][] data=new Object[3][2];
		//First set
		data[0][0]= "FirstSetusrname";
		data[0][1]="SetPassword";
		
		//Second set
		data[1][0]="Secondsetusername";
		data[1][1]="Secondsetpassword";
		
		//Second set
		data[2][0]="ThirdSetUsername";
		data[2][1]="Thirdsetpassword";		
		
		return data;
	}

}
