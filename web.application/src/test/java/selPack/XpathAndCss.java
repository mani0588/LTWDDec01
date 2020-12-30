package selPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class XpathAndCss extends DriverUtil {

	public static void main(String[] args) {

		getDriver("chrome");

		// Xpath
		// Absolute xpath - //body/div/h1/dafg/d/g/dsg/sd/gsd/g/fs/gf/sg/s/f
		// Relative xpath - //body//h1

//		/ - child => //body/div
//		// - child and grand child => //body//h1
//		
//		parent - parent only => //body//h1/parent::div
//		ancestor - parent and grant parent => //body//h1/ancestor::body
//		
//		following-sibling - locate younger one => //body//h1/following-sibling::ul 
//		preceding-sibling - locate elder one => //body//ul/preceding-sibling::h1
//		
//		text() - locate element by visible text => //label[text()='Subject: ']
//		
//		more than one attribute
//		and - //input[@type='email' and @size='20']
//		or - //input[@type='email' or @size='20']
//		
//		not() - //input[(@type='text' or @type='email') and not(@name='subject')]
//		() - //input[(@type='text' or @type='email') and not(@name='subject')]
//		
//		last() - (//input)[last()]
//		
//		position() - //select/option[position()<5] //select/option[position()=5] //select/option[5]
//		
//		count() - //select[count(option) > 200]
//		
//		contains() - //select/option[contains(@value,'geria')]
//		
//		starts-with() - //select/option[starts-with(@value,'Alge')]
		
		
		// Locate last 3 options in the dropdown
			//option[position() > (count(//select/option) -3)]
		// case insensitive matching in xpath
			
		// ignore leading and trailing white spaces in xpath

		List<WebElement> dds2 = driver.findElements(By.tagName("select"));
		for (int i = 0; i < dds2.size(); i++) {
			Select dd = new Select(dds2.get(i));
			int num = dd.getOptions().size();
			String text = dd.getOptions().get(num - 1).getText();

			System.out.println(text);
		}

		List<WebElement> lastOptions = driver.findElements(By.xpath("//select/option[last()]"));
		for (int i = 0; i < lastOptions.size(); i++)
			System.out.println(lastOptions.get(i).getText());

	}

}
