package selPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits extends DriverUtil {

	public static void main(String[] args) throws InterruptedException {

		getDriver("chrome");

		// implicit wait
		// dynamic wait
		// wait based on visibility of the element
		// globally applicable
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // min 0, max 10s, 500ms interval
		driver.findElement(By.name(""));

		// explicit wait / webdriver wait
		// dynamic wait
		// wait based on the specific condition on specific element / object
		WebDriverWait wait = new WebDriverWait(driver, 10); // min 0, max 10s, 500ms interval
		// clicking a link
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		// fluent wait
		// timeout and frequency interval also can be configured
		// we can ignore the exception during the wait
		// fnctional interface - Function
		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);

		WebElement clickseleniumlink = fw.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/div[1]/section"));
			}
		});

		// thread.sleep
		// constant wait
		Thread.sleep(3000); // always 3 seconds

	}

}
