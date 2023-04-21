package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.emulation.Emulation;
import org.openqa.selenium.devtools.v110.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v110.emulation.model.ScreenOrientation;
import org.openqa.selenium.devtools.v110.page.model.Viewport;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocationMock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//20 & 100 are Queretaro Mexico location lattitude and longitude
		driver.manage().deleteAllCookies();
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		
		Map<String,Object> coordinates=new HashMap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 100);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Netflix",Keys.ENTER);
		driver.findElement(By.cssSelector("h3")).click();
		Thread.sleep(3000);
		String title=driver.findElements(By.cssSelector("h1.our-story-card-title")).get(0).getText();
		System.out.println(title);
	}

}
