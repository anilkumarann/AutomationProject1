package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browserutil {
	
	public static RemoteWebDriver getdriver(String browser) {
		RemoteWebDriver driver;
		
	if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		
	else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
	else if(browser.equalsIgnoreCase("safari")) {
			driver= new SafariDriver();
		}
		
	else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	

}
