package ravikumaracademy.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import io.github.bonigarcia.wdm.WebDriverManager;
import ravikumaracademy.PageObjects.CheckoutPage;
import ravikumaracademy.PageObjects.ConfirmationPage;
import ravikumaracademy.PageObjects.Landingpage;
import ravikumaracademy.PageObjects.ProductCataloge;
import ravikumaracademy.PageObjects.cartPage;
import ravikumaracademy.TestComponents.BaseTest;


public class ErrorValidations extends BaseTest{

	@Test(groups= {"ErrorHandling"},retryAnalyzer=Retry.class)
	public  void LoginErrorValidation() throws IOException, InterruptedException  {
		
		landingpage.LoginApplication("cravi.ravikumar1@gmail.com", "Rav@5694");//logging to app
		Assert.assertEquals("Incorrect email or password.", landingpage.ErrorValidation());
	}

	@Test(groups= {"ErrorHandling"})
	public  void ProdutErrorValidation() throws IOException, InterruptedException  {
		
		String productname="ZARA COAT 3";
				
		landingpage.LoginApplication("anshika@gmail.com", "Iamking@000");//logging to app
		ProductCataloge ProductCataloge= new ProductCataloge(driver);
		ProductCataloge.getProductList();//getting the products list
		ProductCataloge.addProdcutToCart(productname);
		ProductCataloge.goToCart();
		
		cartPage cartPage=new cartPage(driver);
		cartPage.getCartItems();
		cartPage.matchCartItems(productname);
		Assert.assertFalse(cartPage.matchCartItems(productname));
				
	}
}
