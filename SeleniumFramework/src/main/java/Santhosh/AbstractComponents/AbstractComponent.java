package Santhosh.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Santhosh.pageObjects.CartPage;
import Santhosh.pageObjects.OrdersPage;

public class AbstractComponent {
	
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[text()='  Cart ']")
	WebElement cartClick;
	
	@FindBy(xpath = "//button[@routerlink='/dashboard/myorders']")
	WebElement myOrdersClick;

	public void waitforTheElementToAppear(By findBy) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitforTheElementToAppear(WebElement findBy) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	public void waitforTheElementToBeDisappear(WebElement ele) throws InterruptedException {
		Thread.sleep(2000);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public  CartPage goToCartPage() {
		cartClick.click();
		CartPage cartPage=new CartPage(driver);
		return cartPage;
		
	}
	
	public  OrdersPage goToOrderPage() {
		myOrdersClick.click();
		OrdersPage orderPage=new OrdersPage(driver);
		return orderPage;
		
	}
	

}
