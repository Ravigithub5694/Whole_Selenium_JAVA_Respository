package ravikumaracademy.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ravikumaracademy.AbstractComponents.AbstractComponents;

public class cartPage extends AbstractComponents {

	WebDriver driver;
	public cartPage(WebDriver driver2) {
		super(driver2);
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(css=".cartSection h3")
	List<WebElement> cartItems;

	
	
	@FindBy(css=".totalRow button")
	WebElement checkout;
	
	By carts=By.cssSelector(".cartSection h3");
	
	public List<WebElement> getCartItems() {
		waitForElementToAppear(carts);
		return cartItems;
	}
	public Boolean matchCartItems(String product) {
	
		
		Boolean match=cartItems.stream().anyMatch(item->item.getText().equalsIgnoreCase(product));
		return match;
	}
	
	public void checkoutTheCart() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,520)");
		waitForElementToClick(checkout);
		checkout.click();
		
	}
}
