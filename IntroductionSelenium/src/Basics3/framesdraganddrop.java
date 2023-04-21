package Basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesdraganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());// prints number of frames in a webpage
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		// driver.switchTo().frame(frame);
		driver.switchTo().frame(0);
		// Drag & dropping using frames here
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, destination).build().perform();
		driver.findElement(By.id("draggable")).click();
		// to switch back to normal page & to come out of frame
		driver.switchTo().defaultContent();
	}

}
