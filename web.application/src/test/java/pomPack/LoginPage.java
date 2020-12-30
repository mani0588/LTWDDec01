package pomPack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver myDriver) {
		driver = myDriver;
	}

	@FindBy(name = "user")
	WebElement txtUsername;

	@FindBy(name = "btnSubmit")
	WebElement btnLogin;

	public void login(String un, String pwd) {
		txtUsername.sendKeys(un + Keys.TAB + pwd + Keys.ENTER);
	}

	public boolean verifyLogin() {
		return btnLogin.isDisplayed();
	}
}
