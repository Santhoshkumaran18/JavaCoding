package Santhosh.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Santhosh.TestComponents.BaseTest;
import Santhosh.pageObjects.CartPage;
import Santhosh.pageObjects.CheckOutPage;
import Santhosh.pageObjects.ConfirmationPage;
import Santhosh.pageObjects.LandingPage;
import Santhosh.pageObjects.ProductCatalogue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsImpl extends BaseTest {
	public LandingPage landingPage;
	public ProductCatalogue productcatalogue;
	public ConfirmationPage confirmationPage;

	@Given("I landed on the ecommerce page")
	public void I_landed_on_the_ecommerce_page() throws IOException {
		landingPage = launchApplication();

	}
	
	@Given("^Logged in with the username (.+) and password (.+)$")
	public void logged_in_username_and_password(String email,String password) {
		productcatalogue = landingPage.LoginApplication(email, password);
	}
	
	@When("^I add the product (.+) from cart$")
	public void add_To_card(String productName) throws InterruptedException {
		List<WebElement> products = productcatalogue.getProductList();
		productcatalogue.addProductToCart(productName);
	}
	
	@When("^checkout (.+) and submit the order$")
	public void checkout_Page(String productName) {
		CartPage cart = productcatalogue.goToCartPage();
		Boolean match = cart.producText(productName);
		Assert.assertTrue(match);
		cart.actionclass();
		CheckOutPage checkOutPage = cart.checkoutPageclick();
		checkOutPage.selectCountry("India");
		confirmationPage= checkOutPage.submitOrder();
	}
	
	@Then("{string} message is displayed on the confirmation page")
	public void message_display_confirmation_Page(String string) {
		String confirmMessages = confirmationPage.confirmMessage();
		Assert.assertTrue(confirmMessages.equalsIgnoreCase(string));
		driver.quit();
	}
	
	 @Then("{string} message is displayed")
	 public void errorMessageDisplayed(String error){
		 Assert.assertEquals(error, landingPage.getErrorMessage());
		 driver.quit();
		 
	 }
	

}
