package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.HomePage;

public class ExtentReportWithTestNG {
	
	ExtentReports extent;
	ExtentTest test;

	WebDriver driver=null;
	@BeforeTest
	public void setUp() {
		ExtentHtmlReporter eReporter = new ExtentHtmlReporter("ExtentWithTestNG.html");
		extent = new ExtentReports();
		extent.attachReporter(eReporter);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreZoomSetting", true);
		
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		driver= new InternetExplorerDriver(caps);



	}
	@Test
	public void first_test(){
		ExtentTest test=extent.createTest("This is the Login Page launch test", "Will launch the login page pop up");
		test.log(Status.INFO, "Test started");
		driver.get("https://www.instacart.ca/");
		test.pass("Launch the website successfully.");
		HomePage hp = new HomePage(driver);
		hp.SignUpClick();
		test.pass("Clicked on login link and the login page is displayed to enter user login credentials");



	}
	@AfterTest
	public void tearDown() {
		
		driver.close();
		test.pass("Closed the browser");
		extent.flush();
		



	}
}
