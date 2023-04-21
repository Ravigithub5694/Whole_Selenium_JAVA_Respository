import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicBrowserInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking browsers
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		System.out.println(); 
	}

}
