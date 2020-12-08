package selPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// Opening browser
		WebDriver driver = new ChromeDriver();

		// Loading App url
		driver.get("https://www.mycontactform.com/samples.php");

	}

}
