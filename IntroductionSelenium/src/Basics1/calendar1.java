package Basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("wedriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		// to select the current date from travel date
		driver.findElement(By.cssSelector("div[data-testid='departure-date-dropdown-label-test-id']")).click();
		driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();

		driver.findElement(By.cssSelector("[data-testid='round-trip-radio-button']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
				.isEnabled());
		System.out
				.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']/div[1]"))
						.getAttribute("style"));
		driver.findElement(By.cssSelector("div[data-testid='one-way-radio-button']")).click();
		System.out
				.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']/div[1]"))
						.getAttribute("style"));
		// when the return trip is selected style attribute opacity is changing from 1
		// to 0.5 ,

		if (driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']/div[1]"))
				.getAttribute("style").contains("0.5")) {
			System.out.println("Return trip is disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

		driver.close();

	}

}
