package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> iframeCount=driver.findElements(By.tagName("iframe"));
		System.out.println(iframeCount.size());
//		WebElement iframe=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(0);
		WebElement dragAndDropSource=driver.findElement(By.id("draggable"));
		WebElement dragAndDropTarget=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(dragAndDropSource,dragAndDropTarget).build().perform();
		driver.switchTo().defaultContent();
		driver.quit(); 
	}

}
