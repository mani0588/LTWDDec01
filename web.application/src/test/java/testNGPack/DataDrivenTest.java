package testNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import selPack.DriverUtil;

public class DataDrivenTest extends DriverUtil {

	// Datadriven - running same test with different data sets called datadriven
	// test
	// It can be achieved by @DataProvider annotation in TestNG

	WebDriver driver;

	@Test(dataProvider = "dp")
	public void verifyLogin(String un, String pwd) {
		System.out.println("checking login is working");
		driver.findElement(By.name("user")).sendKeys(un + Keys.TAB + pwd + Keys.ENTER);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Open browser");
		driver = getDriver("chrome");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Close browser");
		driver.quit();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "adminusers", "password" }, new Object[] { "enduser", "endpass" },
				new Object[] { "agentuser", "agtpass" } };
	}
}
