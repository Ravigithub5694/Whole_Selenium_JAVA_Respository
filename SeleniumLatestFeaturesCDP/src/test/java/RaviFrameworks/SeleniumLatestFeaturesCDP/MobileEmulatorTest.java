package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.emulation.Emulation;
import org.openqa.selenium.devtools.v110.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v110.emulation.model.ScreenOrientation;
import org.openqa.selenium.devtools.v110.page.model.Viewport;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileEmulatorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		DevTools devTools=driver.getDevTools();
		devTools.createSession();//session is created
		//Send command to CDP Methods->CDP Methods invoke & get access to chrome dev tools
		
		// go to CPD official page-https://chromedevtools.github.io/devtools-protocol/
		//belo method sets the screen to desired mobile
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.<Number>empty(), Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.<Boolean>empty(), Optional.<ScreenOrientation>empty(), Optional.<Viewport> empty(), Optional.<DisplayFeature>empty()));
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
		
		
	}

}
