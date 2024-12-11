package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExercises {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents//Santhosh/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.spicejet.com/");
		String content="Senior Citizen";
		List<WebElement> checkboxes=driver.findElements(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-1loqt21.r-18u37iz.r-15d164r.r-1otgn73"));
		for(WebElement checkbox: checkboxes) {
			if(checkbox.getText().equalsIgnoreCase(content));
			checkbox.click();
			break;
		}

	}

}
