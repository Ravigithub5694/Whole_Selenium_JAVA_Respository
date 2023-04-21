package ravikumaracademy.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import ravikumaracademy.PageObjects.Landingpage;

public class BaseTest {

	public WebDriver driver;
	public Landingpage landingpage;
	
	public WebDriver InitializeDriver() throws IOException {
		//properties class can read the global variables
		Properties prop=new Properties();
		FileInputStream fil=new FileInputStream(System.getProperty("user.dir")
				+"\\src\\main\\java\\ravikumaracademy\\Resources\\GlobalVariables.properties");
		prop.load(fil);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("Webdriver.edge.driver", "\\E:msedgedriver.exe");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public Landingpage LaunchApplication() throws IOException {
		driver =InitializeDriver();
		landingpage=new Landingpage(driver);
		landingpage.goTo();
		return landingpage;
	}
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.close();
	}
public String getScreanshot(String testcasename) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File fil=new File(System.getProperty("userdir")+"//reports"+testcasename+".png");
		FileUtils.copyFile(source, fil);
		return System.getProperty("userdir")+"//reports"+testcasename+".png";
	}
}
