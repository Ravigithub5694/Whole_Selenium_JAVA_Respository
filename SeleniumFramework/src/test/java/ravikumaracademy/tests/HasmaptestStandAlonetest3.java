package ravikumaracademy.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
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


public class HasmaptestStandAlonetest3 extends BaseTest{

	@Test(dataProvider="getData")
	public  void SubmitOrder(HashMap<String,String> input) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub

		
		String country="India";
		
		landingpage.LoginApplication(input.get("email"), input.get("password"));//logging to app
		ProductCataloge ProductCataloge= new ProductCataloge(driver);
		ProductCataloge.getProductList();//getting the products list
		ProductCataloge.addProdcutToCart(input.get("product"));
		ProductCataloge.goToCart();
		cartPage cartPage=new cartPage(driver);
		cartPage.getCartItems();
		cartPage.matchCartItems(input.get("product"));
		Assert.assertTrue(cartPage.matchCartItems(input.get("product")));
		Thread.sleep(6000);
		cartPage.checkoutTheCart();
		CheckoutPage CheckoutPage=new CheckoutPage(driver);
			
		CheckoutPage.enteringcountry(driver);
		CheckoutPage.selectCountry(country);
		CheckoutPage.placingOrder();
		ConfirmationPage ConfirmationPage=new ConfirmationPage(driver);
		ConfirmationPage.GetConfirmMessage();
		
		Assert.assertTrue(ConfirmationPage.GetConfirmMessage().equalsIgnoreCase("THANKYOU FOR THE ORDER."));
			
	}

	//To verify of ZARA COAT 3 is present in the orders page 
	@Test(dependsOnMethods="SubmitOrder")
	public void OrderHistoryTest() {
		landingpage.LoginApplication("cravi.ravikumar1@gmail.com", "Ravi@5694");//logging to app
		ProductCataloge ProductCataloge= new ProductCataloge(driver);
		OrderPage orderpage=ProductCataloge.goToOrderPage();
		Assert.assertTrue(orderpage.matchCartItems("ZARA COAT 3"));
		
	}//Dataprovider returns HashMap
	@DataProvider
	public Object[][] getData() {
		
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		map.put("email", "cravi.ravikumar1@gmail.com");
		map.put("password", "Ravi@5694");
		map.put("product", "ZARA COAT 3");
		return new Object[][] {{map},{"anshika@gmail.com","Iamking@000","ADIDAS ORIGINAL"}};
	}
	
	
}
