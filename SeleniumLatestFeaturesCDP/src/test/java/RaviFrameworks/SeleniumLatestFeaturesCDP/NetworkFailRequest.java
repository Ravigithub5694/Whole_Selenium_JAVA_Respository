package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.fetch.Fetch;
import org.openqa.selenium.devtools.v110.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v110.network.model.ErrorReason;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetworkFailRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		// to fail our request and cathc the response message , example Failed, Aborted, TimedOut, AccessDenied, ConnectionClosed, ConnectionReset, ConnectionRefused, ConnectionAborted, ConnectionFailed, NameNotResolved, InternetDisconnected, AddressUnreachable, BlockedByClient, BlockedByResponse
		//what kind of request we should fail shoud be given in pattern
		//java.util.Optional<java.lang.String> urlPattern
	
	Optional<List<RequestPattern>> patterns=	Optional.of(Arrays.asList( new RequestPattern(Optional.of("*getBook*"), Optional.empty(), Optional.empty())));
		
		devTools.send(Fetch.enable(patterns, Optional.empty()));
		
		devTools.addListener(Fetch.requestPaused(), request->
		
		{
			
		 devTools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
			
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
			
		
		
		
	}

}
