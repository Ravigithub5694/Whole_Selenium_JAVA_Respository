package Basics2;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwaitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("wedriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div#start button")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement hello=driver.findElement(By.cssSelector("div#finish h4"));
		
		WebElement fw= wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				
				if(hello.isDisplayed())
				{
				return hello;
				}
				else {
				
				return null;}
				}
			});
			
		System.out.println(driver.findElement(By.cssSelector("div#finish h4")).isDisplayed());
			
		}
	}


