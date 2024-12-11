package SeleniumCoreConcepts;


import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExercises {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		Proxy p=new Proxy();
		p.setHttpProxy("ipaddress");
		options.setCapability("proxy", p);
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("");
	}

}
