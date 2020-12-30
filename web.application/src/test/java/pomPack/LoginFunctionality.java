package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selPack.DriverUtil;

public class LoginFunctionality extends DriverUtil {

	WebDriver driver;
	LoginPage lp;

	@Test
	public void verifyLoginIsSuccessForValidCredentials() {
		lp.login("user", "pass");
		boolean isLoginBtnPresent = lp.verifyLogin();
		Assert.assertFalse(isLoginBtnPresent);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = getDriver("chrome");
		// lp = new LoginPage(driver);
		lp = PageFactory.initElements(driver, LoginPage.class);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
