package SeleniumCoreConcepts;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindOutTheLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		int columndriverSize=columndriver.findElements(By.tagName("a")).size();
		for(int i=1;i<columndriverSize;i++) {
			String ctrlLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ctrlLink);
			Thread.sleep(5000);
		}
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		
		driver.quit();

	}

}
