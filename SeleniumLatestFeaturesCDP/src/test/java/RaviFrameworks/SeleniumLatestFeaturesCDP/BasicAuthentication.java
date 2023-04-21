package RaviFrameworks.SeleniumLatestFeaturesCDP;

import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//predicate , consumer from java 8
	 Predicate<URI>	uriPredicate= uri -> uri.getHost().contains("httpbin.org");
	 //HasAuthentication enable us to enter passwrod user name
	  ((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
	 
	 driver.get("http://httpbin.org/basic-auth/foo/bar");
	}

}
