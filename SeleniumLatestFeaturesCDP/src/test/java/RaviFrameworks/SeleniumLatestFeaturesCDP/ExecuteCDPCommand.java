package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.emulation.Emulation;
import org.openqa.selenium.devtools.v110.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v110.emulation.model.ScreenOrientation;
import org.openqa.selenium.devtools.v110.page.model.Viewport;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteCDPCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		DevTools devTools=driver.getDevTools();
		devTools.createSession();//session is created
		Map deviceMetrics= new HashMap();
		deviceMetrics.put("width", 600);
		deviceMetrics.put("height", 1000);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);
		//useing "executeCdpCommand" to execute the commands
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
		
		
	}

}
