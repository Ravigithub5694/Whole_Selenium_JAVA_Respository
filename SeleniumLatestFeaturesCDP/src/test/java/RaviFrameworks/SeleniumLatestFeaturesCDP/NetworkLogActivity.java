package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.network.Network;
import org.openqa.selenium.devtools.v110.network.model.Request;
import org.openqa.selenium.devtools.v110.network.model.Response;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetworkLogActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.<Integer>empty()));
		
		//get the event of request
		
		devTools.addListener(null, null);
		
		devTools.addListener(Network.requestWillBeSent(), request->
		{
			
			Request req=request.getRequest();
			System.out.println(req.getUrl());
			System.out.println(req.getHeaders());
		}
				
				);
		
		
		//event get fired when response is received
		devTools.addListener(Network.responseReceived(), response->
		
		{
			Response res=response.getResponse();
			//System.out.println(res.getUrl());
			System.out.println(res.getStatus());
			
			if(res.getStatus()>400) {
				System.out.println(res.getUrl()+" is failing with respnse code of "+res.getStatus());
			}
			
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
	}

}
