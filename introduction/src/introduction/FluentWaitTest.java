package introduction;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class FluentWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String textPage = "Hello World!";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		String text = driver.findElement(By.xpath("//div[@id='finish']/h4[text()='Hello World!']")).getText();
//		Assert.assertEquals(textPage, text);
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchFieldException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.xpath("//div[@id='finish']/h4[text()='Hello World!']")).isDisplayed()){
					return driver.findElement(By.xpath("//div[@id='finish']/h4[text()='Hello World!']"));
				}
				else {
					return null;
				}
			}
		});
		System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4[text()='Hello World!']")).getText());

	}

}
