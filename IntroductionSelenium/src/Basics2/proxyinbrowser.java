package Basics2;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class proxyinbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		//to set proxy 
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		option.setCapability("proxy", proxy);
		option.setAcceptInsecureCerts(true);
		//to add the extensions
		//option.addExtensions("file path");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		
	}

}
