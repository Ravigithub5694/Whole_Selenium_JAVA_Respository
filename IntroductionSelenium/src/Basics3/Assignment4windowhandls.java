package Basics3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4windowhandls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignment#4 for handling multiple windows
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);// switching to child window and getting the text
		System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
		driver.switchTo().window(parentid);// switching back to parent window and getting the text
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());

	}

}
