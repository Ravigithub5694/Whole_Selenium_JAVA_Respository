package Basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsmouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
		
		//enter text in capital letters in the text box
		WebElement textbox=driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).contextClick().build().perform();
		
	}

}
