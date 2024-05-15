package UI_Testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utility.Browserutil;

public class UITesting{
	RemoteWebDriver driver;
	@Test
	public void UITestUrl() throws IOException{
		
		driver = Browserutil.getdriver("firefox");
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		dimensions();
		
		NavigateUrl();
		driver.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		dimensions();
		
		NavigateUrl();
		driver.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		dimensions();
		
		NavigateUrl();
		driver.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		dimensions();
		
		NavigateUrl();
		driver.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		dimensions();
		
		driver.quit();
		
	}
     
	
public void Takess() throws IOException{
	
		Date date = new Date();
		String timestamp = date.toString().replace(" ", "").replace(":", "");
		System.out.println(timestamp);
		
		 Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
	     // Save the screenshot to a file
	     ImageIO.write(screenshot.getImage(), "PNG", new File("./fullpage\\firefox\\"+timestamp+".png"));
	}
	
	
public void NavigateUrl() {
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}
	
	
public void dimensions() throws IOException {
		driver.manage().window().setSize(new Dimension(1920,1080));
		Takess();
			
		driver.manage().window().setSize(new Dimension(1366,768));
		Takess();
				
		driver.manage().window().setSize(new Dimension(1536,864));
		Takess();
		
	}

}
