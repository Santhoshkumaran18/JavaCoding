package Santhosh.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	public static ExtentReports getReportObject() {
		ExtentReports extent;
		// ExtentReport //ExtentSparkReporter
		String path = System.getProperty("user.dir") + "//reports//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("WebAutomationResults");
		report.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Santhosh Kumaran S");
		return extent;
		
	}

}
