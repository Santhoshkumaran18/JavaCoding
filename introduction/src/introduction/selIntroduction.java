package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selIntroduction {

	public static void main(String[] args) {
		//Invoking a browser
		//Chrome -> Chromedriver methods
		
//		ChromeDriver driver = new ChromeDriver(); //We need to import the chromedriver utils
		//Chromedriver.exe-> Chrome browser Selenium will invoke the chrome driver and will invoke the chrome browser
		
		//Step to invoke the chrome driver
		//Selenium manager is the step which will connect to the 
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.close();
		
		
		

	}

}
