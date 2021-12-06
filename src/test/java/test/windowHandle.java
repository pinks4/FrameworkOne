package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class windowHandle {
	
	//login pop that opens up when you click on the Login link is not a window, its a modal dialog box which cannotbe handled using windowHandles methods
	//Elements on it can be accessed without switching, as normal

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver32.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instacart.ca/");
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.LoginClick();

		Thread.sleep(3000);
		WebElement loginEmail =driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"));
		loginEmail.click();
		//ginEmail.sendKeys("sikhant.fx@gmail.com");
		
	}


}
