package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShoppingCartSelfExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = { "Cucumber", "Carrot", "Beetroot", "Beans", "Tomato" };
		

//		ShoppingCartSelfExercise sce = new ShoppingCartSelfExercise();
//		sce.addItems(driver, itemsNeeded);
		
		addItems(driver, itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		String promocode="Code applied ..!";
		int j = 0;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		List<WebElement> productsName = driver.findElements(By.cssSelector("h4.product-name"));

		int productsSize = productsName.size();
		System.out.println(productsSize);
		for (int i = 0; i < productsName.size(); i++) {
			String[] name = productsName.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}

		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		String codeApplied=driver.findElement(By.cssSelector(".promoInfo")).getText();
		Assert.assertEquals(codeApplied,promocode);
		driver.quit();
	}

}
