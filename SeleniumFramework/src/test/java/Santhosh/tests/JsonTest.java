package Santhosh.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Santhosh.TestComponents.BaseTest;
import Santhosh.pageObjects.CartPage;
import Santhosh.pageObjects.CheckOutPage;
import Santhosh.pageObjects.ConfirmationPage;
import Santhosh.pageObjects.LandingPage;
import Santhosh.pageObjects.OrdersPage;
import Santhosh.pageObjects.ProductCatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JsonTest extends BaseTest {
//		String productname= "ZARA COAT 3";
	@Test(dataProvider = "getData", groups = { "purchaseOrder" })
	public void SeleniumTest(HashMap<String,String> input)
			throws IOException, InterruptedException {

		ProductCatalogue productcatalogue = landingPage.LoginApplication(input.get("email"), input.get("password"));
		List<WebElement> products = productcatalogue.getProductList();
		productcatalogue.addProductToCart(input.get("product"));
		CartPage cart = productcatalogue.goToCartPage();
		Boolean match = cart.producText(input.get("Product"));
		Assert.assertTrue(true);
		Thread.sleep(1000);
		cart.actionclass();

		CheckOutPage checkOutPage = cart.checkoutPageclick();
		checkOutPage.selectCountry("India");
		ConfirmationPage confirmationPage = checkOutPage.submitOrder();
		String confirmMessages = confirmationPage.confirmMessage();

		Assert.assertTrue(confirmMessages.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	}

	// To verify that Zara coat is displaying in the orders page
	@Test(dependsOnMethods = { "SeleniumTest" }, dataProvider = "getData")
	public void OrderHistoryTest(String email, String password, String productname) {
		ProductCatalogue productcatalogue = landingPage.LoginApplication(email, password);
		OrdersPage ordersPage = productcatalogue.goToOrderPage();
		Assert.assertTrue(ordersPage.VerifyProductDisplay(productname));

	}
	
	
	@DataProvider
	@Test
	public Object[][] getData() throws IOException {

		List<HashMap<String,String>> data=getJsonToMap(System.getProperty("user.dir")+"//src//test//java//Santhosh//Data//PurchaseOrder.json");
		return new Object[][] { { data.get(0) } };
	}
	
//	HashMap<String, String> map=new HashMap<String,String>();
//	map.put("email", "santhoshkumaran@santhosh.com");
//	map.put("password", "December2024@$");
//	map.put("product", "ZARA COAT 3");

}
