package Basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
		String text=driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		//System.out.println(text);
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(text);
		driver.findElement(By.cssSelector("input#name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Assert.assertTrue(alerttext.contains(text));
		
		
	}

}
