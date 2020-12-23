package selPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JSAndDriverConfiguration extends DriverUtil {

	public static void main(String[] args) throws InterruptedException {

		// Driver config
		getDriver("chrome");
		
		// JS
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('maxlength','8');", driver.findElement(By.id("visver_code")));
		
	}

}

