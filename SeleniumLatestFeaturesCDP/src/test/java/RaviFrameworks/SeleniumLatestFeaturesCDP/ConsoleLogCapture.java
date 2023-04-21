package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConsoleLogCapture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//listeners and write the code in the on testfailure method block
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("a.btn-success")).click();
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.id("exampleInputEmail1")).clear();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
		LogEntries logs= driver.manage().logs().get(LogType.BROWSER);//get log entry object
		List<LogEntry> logentries=logs.getAll();//get all method returns all logs
		
		for(LogEntry e:logentries) {//iterating all logs
			
			System.out.println(e.getMessage());		} 
		
	}

}
