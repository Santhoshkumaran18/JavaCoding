package SeleniumCoreConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.Urls;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinksIdentification {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Some java methods will call the URL's and gets you the status code
		// Step1 -> is to get all the URL tied up to the links using selenium
		// Step2-> if the status code>400 then that url is not working-> Link tied up to
		// the url is not working
		Actions a = new Actions(driver);
		SoftAssert s = new SoftAssert();
		a.moveToElement(driver.findElement(By.cssSelector("a[href*='https://www.soapui.org/']"))).build().perform();

		List<WebElement> link = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement Link : link) {
			String url = Link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecode = conn.getResponseCode();
			System.out.println(responsecode);
			s.assertTrue(responsecode < 400, "The link with the text " + Link.getText()
					+ " is broken with the response code of " + responsecode);
		}
		s.assertAll();

	}

}
