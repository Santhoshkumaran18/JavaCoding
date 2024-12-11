package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExercises {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]"))).click().build()
				.perform();
		List<WebElement> frameset = driver.findElements(By.tagName("frameset"));
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println(frameset.size());
		System.out.println(frames.size());
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		String iframeText = driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(iframeText);

	}

}
