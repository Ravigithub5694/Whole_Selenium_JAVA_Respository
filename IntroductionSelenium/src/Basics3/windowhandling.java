package Basics3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		//Handling multiple windows, cliking on blinking text and it will open another window and copying the email
		//and pasting that in th ehome page email field
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();//returns set of strings, parent & child ids
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String email=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("@")[1].split(" ")[0];
		
		driver.switchTo().window(parentid);
		driver.findElement(By.name("username")).sendKeys(email);
	}

}
