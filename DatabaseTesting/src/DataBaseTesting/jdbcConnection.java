package DataBaseTesting;

import java.lang.module.ModuleDescriptor.Requires;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jdbcConnection {
	public static void main(String[] args) throws SQLException, InterruptedException {
		String host="127.0.0.1";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/QAdbtupdated", "root", "Sanjay06@$18");
		Statement s=con.createStatement();
		
		ResultSet rs=s.executeQuery("select * from EmployeeInfo where name='Santhosh'");
		while(rs.next()) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
			username.sendKeys(rs.getString("location"));
			password.sendKeys(rs.getString("name"));
			Thread.sleep(4000);
			driver.quit();
		}

		
		
	
		
		
		
		 
	}

}
