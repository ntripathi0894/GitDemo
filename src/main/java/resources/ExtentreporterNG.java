package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreporterNG {
	static ExtentReports extent ;

	
	public static ExtentReports getreportObject() {
		
		
		//ExtentReport and ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automatiomn Results");
		reporter.config().setDocumentTitle("Test Results");
		
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Nilesh Tripathi");
		return extent;
		
		}

}
