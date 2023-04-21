package Basics3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class driverscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Print the total number of links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//get the links present in the footer section
		//limiting the driver scope to only footer
		WebElement footerdriver=driver.findElement(By.cssSelector("div#gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//print the links in the first column of the footer section. by reaching from the footer driver
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//clcik on the each link of the first link and check if the links are opening or not
		int size=columndriver.findElements(By.tagName("a")).size();
		for(int i=1;i<size;i++) {
			String chord=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(chord);
		}
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(driver.switchTo().window(it.next()).getTitle());
			
		}
			
		driver.quit();
		}
		
		
	}


