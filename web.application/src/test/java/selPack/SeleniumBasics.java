package selPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// Opening browser
		WebDriver driver = new ChromeDriver();

		// implicit timeout - globally applicable, min 0s max 10s
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize window
		driver.manage().window().maximize();

		// Loading App url
		driver.get("https://www.mycontactform.com/samples.php");

		System.out.println("Current title is - " + driver.getTitle());
		System.out.println("Url - " + driver.getCurrentUrl());
		System.out.println("Page source - " + driver.getPageSource());

		// Navigation methods
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

		// locating single element
		WebElement chk1 = driver.findElement(By.name("email_to[]"));
		chk1.click();

		// boolean methods
		boolean isSelected = chk1.isSelected();
		System.out.println(isSelected);
		boolean isDisp = chk1.isDisplayed();
		System.out.println(isDisp);
		boolean isEnabled = chk1.isEnabled();
		System.out.println(isEnabled);

		// close browser
		driver.close();

	}

}
