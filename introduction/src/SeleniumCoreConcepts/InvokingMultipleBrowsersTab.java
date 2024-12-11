package SeleniumCoreConcepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InvokingMultipleBrowsersTab {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator<String> it=windowhandles.iterator();
		String Parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com/");
		Actions a=new Actions(driver);
		String course=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(Parentid);
		WebElement text=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		text.sendKeys(course);
		File file=text.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D://Selenium/santhosh.png"));
		
		System.out.println(text.getRect().getDimension().getHeight());
		
		
		Thread.sleep(3000);
		
		

	}

}
