package Basics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browserInvoking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Browserinvoking
		/*
		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		//driver.quit();
		 * */
		 
		String a="Ravi";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			
		}System.out.println(rev);
		
		
	}

}
