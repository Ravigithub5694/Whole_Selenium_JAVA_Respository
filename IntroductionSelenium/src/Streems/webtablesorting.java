package Streems;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class webtablesorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//go to table and click on veg/fruite name so that it will be sorted and compare if its sorted
		
		//step1- Click on the veg/fruite nam column 
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//get all the webelements into a list
		List<WebElement> weblist=driver.findElements(By.xpath("//tr/td[1]"));
		
		//get the text of all webelements into  originallist
		List<String> originallist=weblist.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original and get sorted list
		List<String> sortedlist=originallist.stream().sorted().collect(Collectors.toList());
		//compare two lists
		Assert.assertTrue(originallist.equals(sortedlist));
		List<String> price;
		//get the price of the vegetables 
		do {
			List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		 price=veggies.stream().filter(s->s.getText().contains("Rice"))
		.map(s->getVeggiePrice(s)).collect(Collectors.toList());
		
		price.forEach(s->System.out.println(s));
		//above code works if the elemnt is in the same page , if the its in different page, we can achieve
		//pagenation with the below code
		if(price.size()<1) {//if the price list has 0 elements means its not in the first page, so click on next page
			
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			//we need to continue to collect the price. so use do while
			Thread.sleep(1000);
		}
		}
		while(price.size()<1);
		
		driver.close();
	}


 public static String getVeggiePrice(WebElement s) {
	 String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return pricevalue;
	 
 }
	 
 }