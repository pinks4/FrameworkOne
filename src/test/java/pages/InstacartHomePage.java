package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstacartHomePage {
	     
		private static WebElement element = null;
	
	public static WebElement loginBtn(WebDriver driver) {
		
		//WebElement loginBtn=driver.findElement(By.xpath("//span[contains(text(),'Log in')]")); 
		//WebElement loginBtn can be made class variable, so we dont have to define it in every function
		
		element=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
		
		return element;
	}
	
	
public static WebElement SignUpBtn(WebDriver driver) {
		
	    element=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
		
		return element;
	}
	

}
