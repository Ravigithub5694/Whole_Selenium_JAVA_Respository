package Basics3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8Autosuggestion {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("unit");
		List<WebElement> countries = driver.findElements(By.cssSelector("ul#ui-id-1 li div"));
		int countriesno = driver.findElements(By.cssSelector("ul#ui-id-1 li div")).size();
		System.out.print(countriesno);
		for (WebElement country : countries) {
			if (country.getText().contains("USA")) {
				country.click();
				break;
			}
		}

	}
}
