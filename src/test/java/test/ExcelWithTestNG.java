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

public class ExcelWithTestNG {
	
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

	
   public static void LoginLaunch() throws InterruptedException {
	driver.get("https://www.instacart.ca/");
	driver.manage().window().maximize();
	HomePage hp = new HomePage(driver);
	hp.LoginClick();
	Thread.sleep(3000);
	}
	
	@Test
	public static void Login() throws InterruptedException {
		driver.get("https://www.instacart.ca/");
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.LoginClick();
		Thread.sleep(5000);
		 System.out.println("Clicked on the login link");
		
		
		/*Set <String> windowhandles= driver.getWindowHandles();
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandles().size());
		 System.out.println("Child window detected if size 2");
		System.out.println(windowhandles);
		Iterator <String> iterator = windowhandles.iterator();
		 String parentWindow=iterator.next();
		 String childWindow=iterator.next();
		 driver.switchTo().window(childWindow);
		 System.out.println("Code working until here3");
		 */
		 
		WebElement loginEmail =driver.findElement(By.xpath("//input[@id='email-8801']"));
		loginEmail.click();
		loginEmail.sendKeys("com");
		System.out.println("Typed in email add");
			
		
		/*String mainHandle= driver.getWindowHandle();
		Set <String> allHandles = driver.getWindowHandles();
		for(String windowHandle : allHandles) {
		
		if(mainHandle.equals(windowHandle)) {
			
			System.out.println(windowHandle);	
			
		}else {
			
			driver.switchTo().window(windowHandle);
			WebElement loginEmail =driver.findElement(By.xpath("//input[@id='email-8801']"));
			WebElement pwd= driver.findElement(By.xpath("//input[@name='password']"));
			loginEmail.click();
			loginEmail.sendKeys("xyz");
			System.out.println("clicked on email field");
			ExcelUtils excel = new ExcelUtils("./excel/data.xlsx","Sheet1");
		 excel.getCellDataString(1, 0);
			
			*/
			//loginEmail.sendKeys(null)
			
		
	}
    
   @AfterTest
   public void tearDown() {
	   driver.close();
	   //driver.quit();
	   System.out.println("Test success!!");
   }

}
