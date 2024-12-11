package introduction;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows=driver.getWindowHandles(); //[Parentwindow,Childwindow]
		Iterator<String> It=windows.iterator();
		String parentId= It.next();
		String childId=It.next();
		driver.switchTo().window(childId).getTitle();
		String emailId=driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String[] text=emailId.split("at")[1].trim().split(" ");
		driver.switchTo().window(parentId); 
		driver.findElement(By.id("username")).sendKeys(text[0]);
		
	}

}
