package assignmentPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	
	ExtentReports extent = new ExtentReports();
	
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	
	@BeforeSuite
	public void ReportSetUp() {
		
		extent.attachReporter(spark);
	}
	
	@AfterSuite
	public void ReportTearDown() {
		
		extent.flush();
		
	}

}
