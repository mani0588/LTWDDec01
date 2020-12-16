package selPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandsOn extends DriverUtil {

	public static void main(String[] args) {

		getDriver("chrome");

		// Select last option from drop-down
		Select dd1 = new Select(driver.findElement(By.name("q3")));
		List<WebElement> options1 = dd1.getOptions();
		int numOfopts1 = options1.size();
		dd1.selectByIndex(numOfopts1 - 1);

		// Select last val form all drop-down
		// webElement == driver.findElement(By.loc("val"))
		List<WebElement> dds2 = driver.findElements(By.tagName("select"));
		for (int i = 0; i < dds2.size(); i++) {
			Select dd = new Select(dds2.get(i));
			List<WebElement> options = dd.getOptions();
			int numOfopts2 = options.size();
			System.out.println(numOfopts2);
			if (numOfopts2 > 200) {
				dd.selectByIndex(numOfopts2 - 1);
			}
		}

		// 1000 - 1000
		// 1000 - numOfVals > 200 == 2dds => 2 iteration => 1000

		List<WebElement> dds3 = driver.findElements(By.xpath("//select[count(option) > 200]"));
		for (int i = 0; i < dds3.size(); i++) {
			Select dd = new Select(dds3.get(i));
			List<WebElement> options3 = dd.getOptions();
			int numOfopts3 = options3.size();
			System.out.println(numOfopts3);
			dd.selectByIndex(numOfopts3 - 1);
		}

	}

}
