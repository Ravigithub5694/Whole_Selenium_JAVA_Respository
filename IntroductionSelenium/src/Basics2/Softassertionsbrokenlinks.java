package Basics2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Softassertionsbrokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Broken URL
		// call the urls and get their network status, all success links have common
		// status code & broken
		// links have different status codes
		// we can achieve this by java methods
		// if the status code is >400 means its broken
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.cssSelector("li.gf-li a"));
		SoftAssert s=new SoftAssert();
		
		for (WebElement link : links) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.connect();
			System.out.println(conn.getResponseCode());
			s.assertTrue(conn.getResponseCode()<400, "the link with text "+link.getText()+" is broken with code "+conn.getResponseCode());
			
			
		}
		s.assertAll();
	}

}
