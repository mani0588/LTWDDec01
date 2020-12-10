package selPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingGroupOfElements extends DriverUtil {

	public static void main(String[] args) {

		getDriver("chrome");

		// Locators - 8
		// id, name, linkText, partialLinkText, tagName, className, xpath, cssSelector

		// select all checkboxes
		// xpath syntax => //tagName[@attName='attVal']
		List<WebElement> allChkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of checkboxes - " + allChkboxs.size());

		// WebElement chk1 = allChkboxs.get(1);
		// chk1.click();

		for (int i = 0; i < allChkboxs.size(); i++) {
			allChkboxs.get(i).click();
		}

	}

}
