package navigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver32.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instacart.ca/");
		driver.manage().window().maximize();
		

	}

}
