package ravikumaracademy.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ravikumaracademy.PageObjects.CheckoutPage;
import ravikumaracademy.PageObjects.ConfirmationPage;
import ravikumaracademy.PageObjects.Landingpage;
import ravikumaracademy.PageObjects.OrderPage;
import ravikumaracademy.PageObjects.ProductCataloge;
import ravikumaracademy.PageObjects.cartPage;
import ravikumaracademy.TestComponents.BaseTest;

public class testStandAlonetest2 extends BaseTest {

	@Test(dataProvider = "getData")
	public void SubmitOrder(String email, String password, String Prodcutname)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String country = "India";

		landingpage.LoginApplication(email, password);// logging to app
		ProductCataloge ProductCataloge = new ProductCataloge(driver);
		ProductCataloge.getProductList();// getting the products list
		ProductCataloge.addProdcutToCart(Prodcutname);
		ProductCataloge.goToCart();
		cartPage cartPage = new cartPage(driver);
		cartPage.getCartItems();
		cartPage.matchCartItems(Prodcutname);
		Assert.assertTrue(cartPage.matchCartItems(Prodcutname));
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,520)");
		cartPage.checkoutTheCart();
		CheckoutPage CheckoutPage = new CheckoutPage(driver);

		CheckoutPage.enteringcountry(driver);
		CheckoutPage.selectCountry(country);
		CheckoutPage.placingOrder();
		ConfirmationPage ConfirmationPage = new ConfirmationPage(driver);
		ConfirmationPage.GetConfirmMessage();

		Assert.assertTrue(ConfirmationPage.GetConfirmMessage().equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	}

	// To verify of ZARA COAT 3 is present in the orders page
	@Test(dependsOnMethods = "SubmitOrder")
	public void OrderHistoryTest() {
		landingpage.LoginApplication("cravi.ravikumar1@gmail.com", "Ravi@5694");// logging to app
		ProductCataloge ProductCataloge = new ProductCataloge(driver);
		OrderPage orderpage = ProductCataloge.goToOrderPage();
		Assert.assertTrue(orderpage.matchCartItems("ZARA COAT 3"));

	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "cravi.ravikumar1@gmail.com", "Ravi@5694", "ZARA COAT 3" },
				{ "anshika@gmail.com", "Iamking@000", "ADIDAS ORIGINAL" } };
	}
	

}
