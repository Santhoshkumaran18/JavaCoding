package SeleniumCoreConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderUIComponents {

	public static void main(String[] args) throws InterruptedException {
		
		String year="2027";
		String monthNumber="6";
		String Date="12";
		
		String[] ExpectedList= {monthNumber,Date,year};
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).getText());
		
		
		List<WebElement> ActualDate=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<ActualDate.size();i++) {
			System.out.println(ActualDate.get(i).getAttribute("value"));
			Assert.assertEquals((ActualDate.get(i).getAttribute("value")),ExpectedList[i]);
		}
		driver.quit();
	}

}
