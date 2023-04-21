package Basics1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.airindia.in/");
	
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#from")).sendKeys("del");
		Thread.sleep(2000);
		
	List<WebElement> options=	driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		 	
	for(WebElement option: options)
	{
		if(option.getText().contains("Delhi"))
				{
					option.click();
					break;
				}
		System.out.println(option.getText()
				);
	}
	}

}
