package Basics3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

public class scrollingtablejavascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//for scrolling we need to use javascript 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scrolling the web page near to the table
		js.executeScript("window.scrollBy(0,520)");
		//scrolling inside the table
		js.executeScript("document.querySelector(\'div.tableFixHead\').scrollTop=5000");
		 //now sum the values in the web table fixed header and validate of that equals to total
		
		List<WebElement> values=driver.findElements(By.cssSelector("div.tableFixHead tr td:nth-child(4)"));
		int sum =0;
		for(int i=0;i<values.size();i++)
		{
			Integer.parseInt(values.get(i).getText());
			System.out.println(Integer.parseInt(values.get(i).getText()));
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		String text=driver.findElement(By.cssSelector("div.totalAmount")).getText();
		int Total= Integer.parseInt(text.split(":")[1].trim());
		System.out.println(Total);
		Assert.assertEquals(sum, Total);
	}

}
