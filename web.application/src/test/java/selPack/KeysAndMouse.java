package selPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class KeysAndMouse extends DriverUtil {
	public static void main(String[] args) throws InterruptedException {

		getDriver("chrome");

		// Keyboard
		// Login function
		driver.findElement(By.name("user")).sendKeys("adminusers" + Keys.TAB + "password" + Keys.ENTER);

		// Mouse
		Actions act = new Actions(driver);

		// click / left click
		act.click(driver.findElement(By.name("user"))).perform();
		Thread.sleep(3000);

		// double click
		act.doubleClick(driver.findElement(By.tagName("h1"))).perform();
		Thread.sleep(3000);

		// scroll / mouse hover
		act.moveToElement(driver.findElement(By.linkText("Testimonials"))).perform();
		Thread.sleep(3000);

		// context / right click
		act.contextClick(driver.findElement(By.linkText("Testimonials"))).perform();
		Thread.sleep(3000);

	}

}
