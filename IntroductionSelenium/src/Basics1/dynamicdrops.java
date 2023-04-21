package Basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdrops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Handling dynamic dropdowns
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div")).click();
		//driver.findElement(By.xpath("//div[text()='HYD']")).click();
		//or below parent to cheild xpath also works
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']  //div[text()='HYD']")).click();
		
		driver.findElement(By.cssSelector("div[data-testid='to-testID-destination']")).click();

		//driver.findElement(By.xpath("//div[text()='DEL']")).click();
		//or below parent to cheild xpath also works
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination'] //div[text()='DEL']")).click();
		
		
	}

}
