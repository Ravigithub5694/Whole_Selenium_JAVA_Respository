package ravikumaracademy.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	public void getReportObject() {
		
		String path=System.getProperty("userdir")+"\\Reports"+"\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("TestAutomation Results");
		reporter.config().setReportName("WebAutomation Results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ravi Kumar");
	}
}
