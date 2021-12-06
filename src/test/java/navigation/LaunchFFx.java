package navigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFFx {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver64.exe");
			
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.instacart.ca/");
			driver.manage().window().maximize();
			
	}

}
