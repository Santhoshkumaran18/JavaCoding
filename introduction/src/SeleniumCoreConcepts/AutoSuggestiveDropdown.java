package SeleniumCoreConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text="Uni";
		String countr="Tunisia";
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(text);
		List<WebElement> country=driver.findElements(By.xpath("//li/div[@class='ui-menu-item-wrapper']"));
		for(WebElement option: country) {
			if(option.getText().equalsIgnoreCase(countr)){
				option.click();
				break;
			}
			System.out.println("The given option is selected");
			
		}
		driver.quit();
		
	}
		

	}


