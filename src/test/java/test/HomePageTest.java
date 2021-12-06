package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import pages.HomePage;

public class HomePageTest {
		
			static WebDriver driver= null;
			
			
			public static void main(String[] args) {
				
				ExtentHtmlReporter ehtmlReports= new ExtentHtmlReporter("report.html");
				
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(ehtmlReports);  //
				
				ExtentTest LoginLaunchTest= extent.createTest("Login Link Opens the Login popup", "Clicking on Login link will take user to login page.");

				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver32.exe");
				driver= new ChromeDriver();
				
				LoginLaunchTest.log(Status.INFO,"Test started");
				//LoginLaunchTest.info("Test started");
				
				driver.get("https://www.instacart.ca/");
				LoginLaunchTest.pass("Navigated to instacart canada site");
				
				
				HomePage hp = new HomePage(driver);
				hp.LoginClick();
				LoginLaunchTest.pass("Clicked on Login link successfully");
				
				driver.close();
				
				LoginLaunchTest.pass("Closed the browser");
				
				LoginLaunchTest.info("Test completed");
				
				extent.flush();

			//LoginLaunch();
			
			
		}
		
		/*public static void LoginLaunch() {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver32.exe");
			driver= new ChromeDriver();
			driver.get("https://www.instacart.ca/");
			HomePage hp = new HomePage(driver);
			hp.LoginClick();
	*/	    

}
