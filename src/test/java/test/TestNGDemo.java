package test;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import pages.HomePage;
import utils.ExcelUtils;

public class TestNGDemo {
	
	//Logger logger = LogManager.getLogger(TestNGDemo.class);
	
	
	static WebDriver driver= null;

	@BeforeTest
	public void setUp() {
		String browser = PropertiesFile.getProperties();
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver32.exe");
			driver= new ChromeDriver();
			//logger.info("Initial logging: Browser has started");
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver64.exe");
			driver= new FirefoxDriver();
			
		}	
	}

	@Test
   public static void LoginLaunch() throws InterruptedException {
	driver.get("https://www.instacart.ca/");
	driver.manage().window().maximize();
	HomePage hp = new HomePage(driver);
	hp.LoginClick();
	Thread.sleep(3000);
	}
    
   @AfterTest
   public void tearDown() {
	   driver.close();
	   driver.quit();
	   System.out.println("Test success!!");
   }

}
