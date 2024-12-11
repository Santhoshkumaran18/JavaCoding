package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndtoEndexercises {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String Name="name";
		String email="email";
		String password="//input[@type='password']";
		String checkbox="//input[@type='checkbox']";
		String radiobutton="//input[@id='inlineRadio1']";
		String date="input[type*='date']";
		String submitbutton="input[type*='submit']";
		
		driver.findElement(By.name(Name)).sendKeys("Santhosh");
		driver.findElement(By.name(email)).sendKeys("santhosh@gmail.com");
		driver.findElement(By.xpath(password)).sendKeys("1234556789");
		driver.findElement(By.xpath(checkbox)).click();
		WebElement dropdowngender=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(dropdowngender);
		dropdown.selectByIndex(0);
		driver.findElement(By.xpath(radiobutton)).click();
		driver.findElement(By.cssSelector(date)).sendKeys("18-02-1999");
		driver.findElement(By.cssSelector(submitbutton)).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert alert-success']")).getText());
	}

}
