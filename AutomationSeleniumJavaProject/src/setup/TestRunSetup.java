package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRunSetup {

	
	public static WebDriver launchBrowser(String browserType, String URL) {
		
		// Setup
		WebDriver driver = null ;
		
		switch (browserType) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:/drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver","C:/drivers\\firefoxdriver.exe");
			 driver = new FirefoxDriver();
			
			break;

		default:
			System.out.println("Please enter a valid browser type!");
			break;
		}
				
				driver.get(URL);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
		
		return driver;
		
	}
	
}
