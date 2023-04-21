package Basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// get the number of rows, columns & print the 2nd row content
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,510)");
		int rowscount = driver.findElements(By.cssSelector(".left-align fieldset table#product tr")).size();
		System.out.println("Number of rows are " + rowscount);
		int columncount = driver.findElements(By.cssSelector(".left-align fieldset table#product tr th")).size();
		System.out.println("Number of columns are "+columncount);
		String rowtext = driver.findElement(By.cssSelector(".left-align fieldset table#product tr:nth-child(3)"))
				.getText();
		System.out.println(rowtext);
	}

}
