package selPack;

import java.util.Set;

import org.openqa.selenium.By;

public class HandlingWindowsFramesAlert extends DriverUtil {

	public static void main(String[] args) {

		getDriver("chrome");

		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		driver.findElement(By.linkText("Try it Yourself »")).click();

		System.out.println(driver.getTitle());

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
