package selPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits extends DriverUtil {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		getDriver("chrome");

		// implicit wait
		// dynamic wait
		// wait based on visibility of the element
		// globally applicable
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //min 0, max 10s, 500ms interval
		driver.findElement(By.name(""));
		
		// explicit wait
		// dynamic wait
		// wait based on the specific condition on specific element / object
		WebDriverWait wait = new WebDriverWait(driver, 10); // min 0, max 10s, 500ms interval
		// clicking a link
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		
		
		// thread.sleep
		// constant wait
		Thread.sleep(3000); // always 3 seconds
		
		
	}

}
