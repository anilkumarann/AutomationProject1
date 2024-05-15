package Testing;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utility.Browserutil;

public class test {
	@Test
	public void loginTest() throws InterruptedException {
		//we can set browser to chrome, firefox, safari 
		RemoteWebDriver driver = Browserutil.getdriver("chrome");
		driver.get(" https://demo.dealsdray.com/");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("prexo.mis@dealsdray.com", "prexo.mis@dealsdray.com");
		HomePage homePage = new HomePage(driver);
		homePage.validating("E:\\Java-1\\FileImport\\demo-data.xlsx");
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Date date = new Date();
		String Timestamp = date.toString().replace(" ", "").replace(":", "");
		System.out.println(Timestamp);

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("./fullpage\\chrome\\" + Timestamp + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}