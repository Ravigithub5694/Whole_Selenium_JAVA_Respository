package Basics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("wedriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		
		//to delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("aspf");// to delete aspf cookie name
		//driver.manage().deleteCookie("aspd"); 
		
		
	}

}
