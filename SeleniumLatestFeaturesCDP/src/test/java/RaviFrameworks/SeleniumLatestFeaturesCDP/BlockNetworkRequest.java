package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.network.Network;

import com.google.common.collect.ImmutableList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlockNetworkRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we can stop loading css or images which takes lot of time for page to load
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.css")));
		long starttime=System.currentTimeMillis();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("a.btn-success")).click();
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		System.out.println(driver.findElement(By.cssSelector("p.sp")).getText());
		long endtime=System.currentTimeMillis();
		System.out.println(starttime-endtime);
		//1461
		
		
		
	}

}
