package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports 
{
	@Test
	public void report()
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		//Step 01: Create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./html_reports/extentReports"+time+".html");
		
		//Step 02: Create ExtentReports object
		ExtentReports extentReport = new ExtentReports();
		
		//Step 03: Attach spark reports to ExetntReports
		extentReport.attachReporter(spark);
		
		//Step 04: Create ExtentTest object
		ExtentTest test = extentReport.createTest("report");
		
		//Step 05: call log() to provide status and message
		test.log(Status.PASS, "log message added into extent report");
		
		//Step 06: call flush() to write report into destination
		extentReport.flush();
	}

}
