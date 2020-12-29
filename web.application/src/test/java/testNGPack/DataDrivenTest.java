package testNGPack;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
		// Assert
		boolean isLoginBtnPresent = driver.findElement(By.name("btnSubmit")).isDisplayed();
		Assert.assertFalse(isLoginBtnPresent);
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
	public Object[][] dp() throws InvalidFormatException, IOException {
		XSSFWorkbook wb = new XSSFWorkbook(new File("./src/test/resources/TestData.xlsx"));
		XSSFSheet sh1 = wb.getSheet("Sheet1");

		Object[][] data = new Object[5][2];
		for (int row = 0; row < 5; row++) {
			for (int clm = 0; clm < 2; clm++) {
				data[row][clm] = sh1.getRow(row).getCell(clm).getStringCellValue();
			}
		}

		return data;
	}
}
