package Basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Assignment#2. to enter details on the page and validate the success message
		System.setProperty("wedriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Ravi");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Ravi@gmail.com");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement drop=driver.findElement(By.id("exampleFormControlSelect1"));
		Select s=new Select(drop);
		s.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.xpath("//label[@for='dateofBirth']/following-sibling::input[1]")).sendKeys("05051994");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		
	}

}
