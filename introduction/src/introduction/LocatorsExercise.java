package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorsExercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit wait is basically 5 sec to wait until the element is coming or not
//		LocatorsExercise le=new LocatorsExercise();
//		String password=le.getPassword(driver);
		String password=getPassword(driver);
		driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String name="Santhosh";
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(3000);
		String successfullLogin=driver.findElement(By.tagName("p")).getText();
		System.out.println(successfullLogin);
		Assert.assertEquals(successfullLogin, "You are successfully logged in.");
		String loginPageName=driver.findElement(By.cssSelector("div[class*=\"login-container\"] h2")).getText();
		Assert.assertEquals(loginPageName, "Hello " + name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String PasswordText=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] passwordArray=PasswordText.split("'");
		String password=passwordArray[1].split("'")[0];
		return password;
		//0--> Please use the temporary password
		//1st--> rahulshettyacademy' to login
	}

}
