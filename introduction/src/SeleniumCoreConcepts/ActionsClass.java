package SeleniumCoreConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(SearchBox).click().sendKeys("One Plus").build().perform();
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[text()='OnePlus Nord CE4 Lite 5G (Super Silver, 8GB RAM, 128GB Storage)']")).click();
		Set<String> windows=driver.getWindowHandles(); //[Parentwindow,Childwindow]
		Iterator<String> It=windows.iterator();
		String parentId= It.next();
		String childId=It.next();
		System.out.println(driver.switchTo().window(childId).getTitle());
		driver.findElement(By.id("add-to-cart-button")).click();
		String AddToCartText=driver.findElement(By.xpath("//h4[text()='Added to cart']")).getText();
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9443629024");
		

	}

}
