package RaviFrameworks.AutoITWindowHandl;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		String downloadpath=System.getProperty("user.dir");
		WebDriverManager.chromedriver().setup();
		
		HashMap<String,Object> chromeprefs=new HashMap<String,Object>();
		chromeprefs.put("profile.default_content_settings.popups", 0);
		chromeprefs.put("download.default_directory", downloadpath);
		ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("prefs", chromeprefs);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.sodapdf.com/png-to-pdf/");
		driver.findElement(By.cssSelector("label.btn-choose")).click();
		Thread.sleep(3000);
		//autoit file script=- call .exe files in our system using  java
		Runtime.getRuntime().exec("C:\\Users\\ravik\\Documents\\fileuploadAutoIt2.exe");
		
		
		Thread.sleep(15000);
		//driver.findElement(By.cssSelector("a.btn-base")).click();
		File f=new File(downloadpath+"/sodapdf-converted.pdf");
		if(f.exists()){
			System.out.println("file found");
		if(	f.delete()) {
			System.out.println("file deleted");
		}
		}
		
	}

}
//Shift focus to the file upload windows
		//set text/path into file name edit box
		//click open to upload file
		/*
		Au3info- record window component objects

		Build Script -scite.exe

		Save it- .au3 extenstion
		Convert file into .exe by compiling .au3 file
Call .exe file with Runtime class in java into your selenium tests

*/
		// now start downloading the converted file 
