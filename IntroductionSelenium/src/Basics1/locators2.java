package Basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sibling traverse , parent child &  Child to parent travcer
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.print(driver.findElement(By.xpath("//div/button/following-sibling::button[1]")).getText());
		
	//parent to child
		//System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div/button[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div/a/following-sibling::button[2]")).getText());
		
	}

}
