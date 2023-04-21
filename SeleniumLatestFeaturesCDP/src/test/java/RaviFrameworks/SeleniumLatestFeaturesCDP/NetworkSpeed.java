package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.network.Network;
import org.openqa.selenium.devtools.v110.network.model.ConnectionType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetworkSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//at some particular time in a day network will be slow because of many users so that to 
		//Network.emulateNetworkConditions
		//Network.ConnectionType #
		/*The underlying connection technology that the browser is supposedly using.
		Allowed Values: none, cellular2g, cellular3g, cellular4g, bluetooth, ethernet, wifi, wimax, 
		other*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.<Integer>empty()));
		
		//true means no internet
		// false emans network connected
		devTools.send(Network.emulateNetworkConditions(false, 3000, 20000, 10000, Optional.of(ConnectionType.ETHERNET)));
		
		devTools.addListener(Network.loadingFailed(), loadingfailed->
		
		{
			System.out.println(	loadingfailed.getTimestamp());
			System.out.println(loadingfailed.getErrorText());
				
	});
		long starttime=System.currentTimeMillis();
		
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".btn-primary")).click();
	
		long endtime=System.currentTimeMillis();
		System.out.println(starttime-endtime);
		//14735
	}

}
