package Basics1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		System.setProperty("wedriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("go-to-login-btn")).click(j);
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("div button[class='reset-pwd-btn']")).click();
		//System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		//driver.close();
		Locators1 is= new Locators1();
		String password=is.getpassword(driver);
		System.out.print(password);
		driver.close();
		
		
		
	}
		private static void IntroductionSelenium() {
		// TODO Auto-generated method stub
		
	}
		public String getpassword(WebDriver driver) throws InterruptedException
		{
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("div button[class='reset-pwd-btn']")).click();
			String passwordText=driver.findElement(By.cssSelector(".infoMsg")).getText();
			String text1=passwordText.split("'")[1].split("'")[0].trim();
			return text1;
		}
}
