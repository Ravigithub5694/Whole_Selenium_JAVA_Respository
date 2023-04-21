package Streems;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterusingstreems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		//filter option is working fine or not
		//after filter with Rice we will be seeing only one item
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));//list after entering the rice into filter
		//box
		List filteredlist=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		//above is the list of the resulted filter
		Assert.assertEquals(veggies.size(), filteredlist.size());
	}

}
