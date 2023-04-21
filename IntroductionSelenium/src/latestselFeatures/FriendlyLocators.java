package latestselFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class FriendlyLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		//above() example
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		String text=driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
		System.out.println(text);
		//below() example
		WebElement dob=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
	//toLeft of
		
		WebElement check=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(check)).click();
		
	//toRight of
		WebElement right=driver.findElement(By.id("inlineRadio1"));
		String rightof=driver.findElement(with(By.tagName("label")).toRightOf(right)).getText();
		System.out.println(rightof);
	}

}
