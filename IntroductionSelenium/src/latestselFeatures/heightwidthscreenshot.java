package latestselFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class heightwidthscreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement names=driver.findElement(By.cssSelector("input[name='name']"));
		//height & width of the webelemnt names
		System.out.println(names.getRect().getDimension().getHeight());
		System.out.println(names.getRect().getDimension().getWidth());
		
	}

}
