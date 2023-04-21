package latestselFeatures;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multibrowserinvok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//invoking multiple windows
		//first navigate to https://rahulshettyacademy.com/angularpractice/
		//fill the name field with the first course name in the below link
		//https://rahulshettyacademy.com
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		//need to switch to ew window using window handles
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		driver.navigate().to("https://rahulshettyacademy.com");
		String name=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
		.get(1).getText();
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys(name);
	}
	

}
