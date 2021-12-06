package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	public HomePage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	
	static WebDriver driver= null;
	
	 By loginBtn = By.xpath("//span[contains(text(),'Log in')]");
	       
	 By signUpBtn = By.xpath("//span[contains(text(),'Sign up')]");
	 

	
	public void LoginClick() {
		
		driver.findElement(loginBtn).click();
		
	}
	
public void SignUpClick() {
	
		driver.findElement(signUpBtn).click();
		
	}

}
