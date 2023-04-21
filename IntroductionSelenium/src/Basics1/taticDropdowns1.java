package Basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class taticDropdowns1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Static dropdowns
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//if the dropsown has select tagname and the values are fixed then thay are called
		// Static dropdwons
		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select dropDown=new Select(drop);
		
		dropDown.selectByIndex(2);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		//code to select USD
		
		dropDown.selectByValue("INR");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		dropDown.selectByVisibleText("USD");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		//other dropdowns selecting adults
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//to select 6 adults
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		for(int i=1;i<5;i++) 
		{
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		
		}
		
		driver.findElement(By.cssSelector("#btnclosepaxoption.buttonN")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(), "5 Adult");
		
		
		

		

	}
}