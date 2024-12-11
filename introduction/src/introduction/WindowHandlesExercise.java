package introduction;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlesExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Multiple Windows']"))).click().build().perform();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		String cwText=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(cwText);
		driver.switchTo().window(parentwindow);
		String pwText=driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
		System.out.println(pwText);
		driver.quit();

	}

}
