package Basics2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//label[@class='customradio']/following-sibling::label")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div.modal-body")).getText());
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		
		Select s=new Select(driver.findElement(By.cssSelector("select.form-control")));
		s.selectByVisibleText("Consultant");
		
		driver.findElement(By.cssSelector("input#terms")).click();
		
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		int itemsno=driver.findElements(By.cssSelector("button.btn.btn-info")).size();
		System.out.println(driver.findElements(By.cssSelector("button.btn.btn-info")).size());
		
		int k=0;
		for(int i=0;i<itemsno;i++) {
		driver.findElement(By.cssSelector("button.btn.btn-info")).click();
		k++;
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		
		}
	}


