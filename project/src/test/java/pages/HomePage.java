package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// Driver and it's initilazation
	public HomePage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='chevron_right']")
	WebElement Ordermenu;

	@FindBy(xpath = "//span[text()='Orders']")
	WebElement order;

	@FindBy(xpath = "//button[@type='button' and @align='right']")
	WebElement AddBulk;

	@FindBy(xpath = "//input[@type='file']")
	WebElement AddFile;

	@FindBy(xpath = "//button[text()='Import']")
	WebElement Import;

	@FindBy(xpath = "//button[text()='Validate Data']")
	WebElement validate;

public void validating(String FilePath) throws InterruptedException {
		Ordermenu.click();
		order.click();
		Thread.sleep(5000);
		AddBulk.click();
		Thread.sleep(5000);
		AddFile.sendKeys(FilePath);
		Import.click();
		Thread.sleep(5000);
		validate.click();

	}


}
