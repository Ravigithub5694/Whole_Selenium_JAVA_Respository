package ravikumaracademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {


	ExtentReports extent;
	@BeforeTest
	public void ExtentReports() {
		//ExtentReports & ExtentSparkreport calss
		String path=System.getProperty("userdir")+"\\Reports"+"\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("TestAutomation Results");
		reporter.config().setReportName("WebAutomation Results");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	
	}

	@Test
	public void initializeBrowser() {
		ExtentTest test=extent.createTest("initializeBrowser");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		test.addScreenCaptureFromBase64String(null);
		
		
		extent.flush();
	}
	
}
