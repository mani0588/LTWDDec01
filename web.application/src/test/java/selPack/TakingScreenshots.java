package selPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class TakingScreenshots extends DriverUtil {
	public static void main(String[] args) throws IOException {

		getDriver("chrome");

		// Screenshot using selenium
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen, new File("./src/test/resources/MyContactForm.png"));

		// Screenshot using shutterbug
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS, 500).withName("MyContactForm_shutterbug")
				.save("./src/test/resources/screenshots/");

	}

}
