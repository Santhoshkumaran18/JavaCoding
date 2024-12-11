package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		int j=0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Carrot","Tomato","Beans"};
		//We'll be getting the productsName of all the elements
		List<WebElement> productsName = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(productsName.size());
		for (int i = 0; i < productsName.size(); i++) {
			String[] name = productsName.get(i).getText().split("-");
			String formattedName = name[0].trim();
			System.out.println(formattedName);
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				if(j==itemsNeeded.length) {
					break;
				}
			}
		}

	}

}
