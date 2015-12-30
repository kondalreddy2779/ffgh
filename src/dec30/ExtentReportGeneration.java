package dec30;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportGeneration 
{
	@Test
	public void reportTest() throws IOException
	{
		ExtentReports reports=new ExtentReports("D:\\kondalselenium1234\\auroraproj\\XSLT_Reports\\Reports\\index.html",true);
		ExtentTest test=reports.startTest("Google & Gmail Test");
		FirefoxDriver driver=new FirefoxDriver();
		test.log(LogStatus.INFO,"Launched firefox");
		driver.get("http://google.com");
		test.log(LogStatus.INFO,"Opened Google");
		driver.findElement(By.linkText("Gmail")).click();
		test.log(LogStatus.INFO,"Clicked on Gmail");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\kondalselenium1234\\auroraproj\\src\\com\\qedge\\screenshots\\Gmail.png"));
		test.addScreenCapture("D:\\kondalselenium1234\\auroraproj\\src\\com\\qedge\\screenshots\\Gmail.png");
		reports.endTest(test);
		reports.flush();
	}
	
	}

