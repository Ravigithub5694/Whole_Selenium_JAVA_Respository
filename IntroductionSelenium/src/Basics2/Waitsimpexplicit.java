package Basics2;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitsimpexplicit {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// create an Array of items to be added to the cart

		String[] itemsToCart = { "Cucumber", "Beetroot", "Coriander", "Cabbage" };

		driver.get("https://www.bigbasket.com/");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='dropdown-toggle meganav-shop']")).click();
		driver.findElement(By.linkText("Fruits & Vegetables")).click();
		// to select all ietms in alist
		//Thread.sleep(4000);
		Additems(driver, itemsToCart);

		// clicking the cart items and checkout
		driver.findElement(By.className("basket-content")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[qa='viewBasketMB']")));
		driver.findElement(By.cssSelector("button[qa='viewBasketMB']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#otpEmail")));
		driver.findElement(By.cssSelector("#otpEmail")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login using Email Address']")).click();

		// driver.close();
	}

	public static void Additems(WebDriver driver, String[] itemsToCart) {
	
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
	w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[qa='product_name']")));
		List<WebElement> products = driver.findElements(By.cssSelector("div[qa='product_name']"));
		// iterating over all the elements
		System.out.println(products.size());
		// driver.findElement(By.cssSelector("button[qa='add']")).click();

		for (int i = 1; i < products.size(); i++) {
			// System.out.println(products.get(i).getText());

			String[] name1 = products.get(i).getText().split("Fresho");
			String names = name1[1].trim();

			String[] name3 = names.split(" ");
			String item2 = name3[0].trim();
			// System.out.println(name);
			// convert array to arraylist for each search
			// check if the item is present in the array list
			List al = Arrays.asList(itemsToCart);

			int k = 0;// to exit the loop after selecting the desired items to the cart

			if (al.contains(item2)) {
				driver.findElements(By.cssSelector("button[qa='add']")).get(i).click();
				k++;
				if (k == al.size()) {

					break;
				}
			}
		}
	}
}

	
	
	


