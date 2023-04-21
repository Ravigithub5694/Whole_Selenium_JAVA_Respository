package Basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkBoxesAssignement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("wedriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//number of check boxes present in the page
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		while(!driver.findElement(By.id("checkBoxOption1")).isSelected())
		{
			driver.findElement(By.id("checkBoxOption1")).click();
		}
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	}
	

}
