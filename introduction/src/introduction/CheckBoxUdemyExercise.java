package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxUdemyExercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String checkbox="//input[@id='checkBoxOption1']";
		WebElement checkboxClick=driver.findElement(By.xpath(checkbox));
		checkboxClick.click();
		Thread.sleep(3000);
		System.out.println(checkboxClick.isSelected());
		checkboxClick.click();
		System.out.println(checkboxClick.isSelected());
		List<WebElement> checkBoxSize=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkBoxSize.size());
		
		
	}

}
