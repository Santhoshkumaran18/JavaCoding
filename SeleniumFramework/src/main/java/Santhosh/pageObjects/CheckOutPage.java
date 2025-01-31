package Santhosh.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Santhosh.AbstractComponents.AbstractComponent;

public class CheckOutPage extends AbstractComponent {
	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Select Country']")
	WebElement country;
	
	@FindBy(css = ".action__submit")
	WebElement submitButton;
	
	@FindBy(css = ".ta-item:nth-of-type(2)")
	WebElement selectCountry;
	
	
	
	By results=By.cssSelector(".ta-results");
	
	public void selectCountry(String CountryName) {
		Actions a=new Actions(driver);
		a.sendKeys(country,CountryName).build().perform();
		waitforTheElementToAppear(results);
		selectCountry.click();
	}
	
	public ConfirmationPage submitOrder() {
		Actions a=new Actions(driver);
		a.moveToElement(submitButton).click().build().perform();
		return new ConfirmationPage(driver);
	}

}
