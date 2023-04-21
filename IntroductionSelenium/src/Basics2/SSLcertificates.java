package Basics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLcertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		//EdgeOptions option1=new EdgeOptions();
		//option1.setAcceptInsecureCerts(true);
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		//System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		//WebDriver driver1=new EdgeDriver(option1);
		//driver1.get("https://expired.badssl.com/");
		//driver.manage().window().maximize();
		
		
	
	}

}
