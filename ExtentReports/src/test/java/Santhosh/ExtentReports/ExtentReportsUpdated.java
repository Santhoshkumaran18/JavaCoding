package Santhosh.ExtentReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsUpdated {
	ExtentReports extent;

	@BeforeTest
	public void config() {
		// ExtentReport //ExtentSparkReporter
		String path = System.getProperty("user.dir") + "//reports//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("WebAutomationResults");
		report.config().setDocumentTitle("Test Results");
		;

		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Santhosh Kumaran S");

	}

	@Test
	public void InitialDemo() {
		ExtentTest test = extent.createTest("InitialDemoUpdated");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		test.fail("Results Do not match");
		extent.flush();
		driver.quit();
	}
}
