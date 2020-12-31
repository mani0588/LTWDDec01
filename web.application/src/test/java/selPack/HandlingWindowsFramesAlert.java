package selPack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWindowsFramesAlert extends DriverUtil {

	public static void main(String[] args) {

		getDriver("chrome");

		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		driver.findElement(By.linkText("Try it Yourself »")).click();

		System.out.println(driver.getTitle());

		WebDriverWait wait = new WebDriverWait(driver, 10); // min 0, max 10s, 500ms interval
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> ids = driver.getWindowHandles();
		String secondWinID = ids.toArray()[1].toString();
		driver.switchTo().window(secondWinID);
		
		System.out.println(driver.getTitle());

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();

	}

}
