package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	// Driver and it's initilazation
	RemoteWebDriver driver;

	public LoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(name = "username")
	WebElement inputUsername;

	@FindBy(name = "password")
	WebElement inputPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement buttonLogin;

	public void login(String username, String password) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(inputUsername));
		inputUsername.sendKeys(username);
		inputPassword.sendKeys(password);
		buttonLogin.click();
		Thread.sleep(5000);
	}
	
}
