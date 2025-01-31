package Santhosh.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Santhosh.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	
	WebDriver driver;
	public LandingPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//input[@type='email']") //santhoshkumaran@santhosh.com
	WebElement Username;
	
	@FindBy(xpath = "//input[@type='password']") //December2024@$
	WebElement passwordele;
	
	@FindBy(xpath = "//input[@type='submit']") //December2024@$
	WebElement submit;
	
	@FindBy(css = "[class*='flyInOut']")
	WebElement errormessage;
	
	
	public ProductCatalogue LoginApplication(String email,String password) {
		Username.sendKeys(email);
		passwordele.sendKeys(password);
		submit.click();
		ProductCatalogue productcatalogue=new ProductCatalogue(driver);
		return productcatalogue;
	}
	
	public String getErrorMessage() {
		waitforTheElementToAppear(errormessage);
		return errormessage.getText();
	}
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	

	

}
