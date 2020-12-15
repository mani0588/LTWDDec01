package selPack;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDiffElements extends DriverUtil {

	public static void main(String[] args) throws InterruptedException {

		getDriver("chrome");

		/// links
		// driver.findElement(By.linkText("Basic Contact Form")).click();
		driver.findElement(By.partialLinkText("Basic Contact ")).click();

		driver.navigate().back();

		// Text box
		driver.findElement(By.name("subject")).sendKeys("Selenium Webdriver");
		driver.findElement(By.name("email")).sendKeys("mani@gmail.com");

		// Dropdown
		Select dd = new Select(driver.findElement(By.id("q3")));
		Thread.sleep(2000);
		dd.selectByVisibleText("Second Option");
		Thread.sleep(2000);
		dd.selectByIndex(2);
		Thread.sleep(2000);
		dd.selectByValue("Fourth Option");

		// confirm the selected value
		String selectedEle = dd.getFirstSelectedOption().getText();
		System.out.println("The current selected element is - " + selectedEle);

		// count number of options
		List<WebElement> options = dd.getOptions();
		System.out.println("Total number of options - " + options.size());

		// Radio button
		driver.findElement(By.xpath("//input[@value='Third Option']")).click();

		// File upload
		File file = new File("");
		String filePath = file.getAbsolutePath() + "\\src\\test\\resources\\pom.xml";
		driver.findElement(By.id("attach4589")).sendKeys(filePath);

		// button
		driver.findElement(By.name("submit")).click();

		// Get error text
		String errors = driver.findElement(By.tagName("ul")).getText();
		System.out.println(errors);

	}

}
