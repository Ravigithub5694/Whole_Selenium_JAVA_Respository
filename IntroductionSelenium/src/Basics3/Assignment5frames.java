package Basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame(0);
				
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
