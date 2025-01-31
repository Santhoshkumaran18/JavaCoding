package AutoItDataDrivern;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		String downloadPath = System.getProperty("user.dir");
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
		Thread.sleep(5000);
		// We need to now move to the window opened and open the respective file

		Runtime.getRuntime().exec("C:\\Users\\S Santhosh Kumaran\\Downloads\\fileupload.exe");
		WebElement convertnowButton = driver.findElement(By.xpath("//span[@id='processTaskTextBtn']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='processTaskTextBtn']")));
		Thread.sleep(4000);
		convertnowButton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='pickfiles']")));
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@id='pickfiles']")).getText());
		Thread.sleep(4000);

		File f = new File(downloadPath + "/ilovepdf_pages-to-jpg.zip");
		if (f.exists()) {
			Assert.assertTrue(f.exists());
			if(f.delete()) {
				System.out.println("File got deleted");
			}
		} else {
			System.out.println("File is not found");
		}

	}

}
