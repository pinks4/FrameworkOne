package navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) {
		
		
		clickSignUp();

	}
	
	public static void clickSignUp() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.instacart.ca/");
        driver.manage().window().maximize();
        WebElement SignUpBtn= driver.findElement(By.xpath("//span[contains(text(),'Sign up')]"));
        SignUpBtn.click();
        
        

	}

}
