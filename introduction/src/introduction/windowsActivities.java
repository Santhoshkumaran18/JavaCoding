package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fogg perfumes for men");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fogg perfumes for men");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
