package SeleniumCoreConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignments1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		String CheckboxText="//label[@for='benz']";
		Checkbox.click();
		WebElement checkboxOptionText=driver.findElement(By.xpath(CheckboxText));
		String text=checkboxOptionText.getText();
		WebElement staticDropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText(text);
		Thread.sleep(4000);
		String name="//input[@id='name']";
		driver.findElement(By.xpath(name)).sendKeys(text);
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		String alerText=driver.switchTo().alert().getText();
		Thread.sleep(4000);
		String[] alertoption=alerText.trim().split(",");
		String[] firstIndextValue=alertoption[0].trim().split(" ");
		String santhosh=firstIndextValue[1];
		Assert.assertEquals(santhosh, text);
		driver.quit();
		
		
		
		
		
		
		

	}

}
