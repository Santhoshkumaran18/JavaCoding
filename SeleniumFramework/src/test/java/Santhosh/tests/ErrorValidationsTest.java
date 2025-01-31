package Santhosh.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Santhosh.TestComponents.BaseTest;
import Santhosh.TestComponents.Retry;
import Santhosh.pageObjects.CartPage;
import Santhosh.pageObjects.CheckOutPage;
import Santhosh.pageObjects.ConfirmationPage;
import Santhosh.pageObjects.LandingPage;
import Santhosh.pageObjects.ProductCatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorValidationsTest extends BaseTest {

	@Test (groups = {"ErrorHandling"},retryAnalyzer = Retry.class)
	public void LoginErrorValidation() throws IOException, InterruptedException {

		String productname = "ZARA COAT 3";
		landingPage.LoginApplication("santhoshkuman@sthosh.com", "Decemr2024@$");
		Assert.assertEquals("Incorrect email password.", landingPage.getErrorMessage());

	}
	
	@Test(groups = {"ErrorHandling"})
	public void productErrorValidation() throws IOException, InterruptedException {
	
	String productname= "ZARA COAT 3";
	ProductCatalogue productcatalogue=landingPage.LoginApplication("santhoshkumaran@santhosh.com", "December2024@$");
	List<WebElement> products=productcatalogue.getProductList();
	productcatalogue.addProductToCart(productname);
	CartPage cart=productcatalogue.goToCartPage();
	Boolean match=cart.producText("ZARA COAT 33");
	Assert.assertFalse(match);
		

}

}
