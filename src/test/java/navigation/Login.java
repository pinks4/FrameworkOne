package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.InstacartHomePage;

public class Login {

	static WebDriver driver= null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver32.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.instacart.ca/");
		driver.manage().window().maximize();
		InstacartHomePage.loginBtn(driver).click();
		
		
		
	}
	
}
