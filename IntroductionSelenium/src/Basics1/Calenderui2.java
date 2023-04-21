package Basics1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calenderui2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String year = "2022";
		String month = "December";
		String date = "26";
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// In this program we will select the desired date in the calendar
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// first select the desired year
		driver.findElement(By.id("_depdateeu1")).click();
		// driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();

		getmonth(driver, month);
		getdate(driver, date);

	}

	public static void getdate(WebDriver driver, String date) {
		// this method is to get the desired year
		// we are selecting the date first
		// div#ui-datepicker-div div[class='ui-datepicker-group
		// ui-datepicker-group-first'] a.ui-state-default

		String datelocator = "div#ui-datepicker-div div[class='ui-datepicker-group ui-datepicker-group-first'] a.ui-state-default";

		List<WebElement> datelist = driver.findElements(By.cssSelector(datelocator));
		int count = datelist.size();

		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.cssSelector(datelocator)).get(i).getText();
			if (text.equalsIgnoreCase(date)) {
				driver.findElements(By.cssSelector(datelocator)).get(i).click();
				break;
			}

		}

	}

	public static void getmonth(WebDriver driver, String month) {
		// now select the desired month
		String monthyrlocator = "div#ui-datepicker-div div[class='ui-datepicker-group ui-datepicker-group-first'] span.ui-datepicker-month";
		String monthyr = driver.findElement(By.cssSelector(monthyrlocator)).getText();

		while (!driver.findElement(By.cssSelector(monthyrlocator)).getText().contains(month)) {

			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
		}

		System.out.println(driver.findElement(By.cssSelector(monthyrlocator)).getText());
	}

}
