package latestselFeatures;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbelmtpartialscreenshot {

	public static void main(String[] args) throws IOException {
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
				WebElement names=driver.findElement(By.cssSelector("input[name='name']"));
				names.sendKeys(name);
				//taking webelement partial screenshot
				File src=names.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("webelementPartialscreenshot.png"));
				
	}

}
