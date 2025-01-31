package Santhosh.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Santhosh.pageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectsModelDesign {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		String productname= "ZARA COAT 3";
		LandingPage landingPage=new LandingPage(driver);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("santhoshkumaran@santhosh.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("December2024@$");
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod=products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
		System.out.println(prod);
		
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		
		
		
		String toastMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container"))).getText();
		System.out.println(toastMessage);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='  Cart ']")).click();
		
		List<WebElement> productext=driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match=productext.stream().anyMatch(cartproduct->cartproduct.getText().equalsIgnoreCase(productname));
		System.out.println(match);
		Assert.assertTrue(true);
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector(".totalRow button"))).build().perform();
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		WebElement country=driver.findElement(By.xpath("//input[@placeholder='Select Country']"));
		
		a.sendKeys(country, "India").build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		
		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
	
		a.moveToElement(driver.findElement(By.cssSelector(".action__submit"))).click().build().perform();
		
		String thankyoutext=driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(thankyoutext.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.quit();

	}

}
