package testNGPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {
	
	@BeforeMethod
	public void beforerun() {
		System.out.println("run me first");
	}
	@Test
	public void Testrun() {
		
		PS2 ps3=new PS2(3);
		int a=3;
		doThis();
		System.out.println(ps3.increment());
		System.out.println(ps3.decrement());
		System.out.println(ps3.multiplications());
	}
	
	

}
