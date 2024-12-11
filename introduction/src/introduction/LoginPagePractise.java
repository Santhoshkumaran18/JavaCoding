package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		loginPagePractise(driver);

	}
	
	public static void loginPagePractise(WebDriver driver) throws InterruptedException {
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		String name="rahulshettyacademy";
		String password="learning";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		// After login page code
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-info")));
		List<WebElement> addToCart=driver.findElements(By.xpath("//div[@class='card-footer']/button[@class='btn btn-info']"));
		System.out.println(addToCart.size());
		for(int i=0;i<addToCart.size();i++) {
			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
	}

}