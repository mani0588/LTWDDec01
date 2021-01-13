package testNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	@Test
	public void verifyValidErrorForAllMandatoryFields() {

		// Do not fill any of the fields
		// click submit
		
		// fname
		// verification - soft assert - fail and not stop further execution
		// lname
		// verification - soft assert
		// mob num
		// verification - soft assert
		// email
		// verification - soft assert

		// 6 fileds - optional

		// actual assert will be performed at the end

		Assert.assertTrue(true);

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(true);
		sa.assertTrue(false);
		sa.assertTrue(true);
		sa.assertTrue(false);
		sa.assertAll();
		
		
//		How do you handle the group of elements?
		// findElements and List<WebElement>
		
//		How do you handle the dynamic elements?
		// id='abc123'
		// Relative xpath methods like starts-with / contains
		
//		What is the difference between close and quit methods?
		// driver.close(); - close current window
		// driver.quit(); - close all associated windows
		
//		What is the difference between implicit, explicit and fluent wait?
		// implicit - globally applicable in findElement() and based visibility of element
		// explicit - specific to the element with specific condition
		// fluent - frequency of verification can be configured and you can ignore the exception during this wait
		
//		What are all the different selenium exceptions you faced?
		// NoSuchElementException - element is not present in html
		// TimeoutException - selenium waits
		// StaleElementReferenceException - 
		// WebElement e = driver.findElement(By.id(""));
		//.....
		// page might have refreshed
		// e.click();
		// NoActiveAlertException - no alert popup right now
		 
//		How do you get the title and url of the browser?
		// getTitle() and getCurrentUrl()
		
//		How do you take the screenshot?
		// TakesScreenshot and getScreenshotAs()
		// Shutterbug API or AShot API
		
//		Tell us some of the TestNG annotations
		// beforesuite, beforetest, beforeclass, beforemothod, test + dataProvider, aftermethod, afterclass, aftertest, aftersuite
		
//		How many test cases you will automate per day?
		// 1 or 2 test cases [depends on the complexity]
		
//		What is the difference between xpath and CSS selector?
		// //input[@type='checkbox'] - xpath
		// input[type='checkbox'] - css
		
//		How many locators you have in Selenium? which locators do you use and why?
		// 8
		// xpath can be supported all situations, so we prefer to use xpath
		
//		What is the difference between / and //?
		// / to locate only child
		// // to locate child and grant-child
		
//		How do you change the attributes of an element?
		// JavascriptExecutor and js.executeScript('setAttribute', attname, val);
		
//		How do you enter value into text box without using send keys?
//		(alternative question: Send keys is not working then how do you enter values?)
		// JavascriptExecutor and js.executeScript('setAttribute', value, 'mani');
		
//		How do you handle the webtables? (get number of rows/columns/cells)
		// driver.fes(By.xpath("//table[@id='customers']//tr")).size();
		// driver.fes(By.xpath("//table[@id='customers']//tr[1]/th")).size();
		// driver.fes(By.xpath("//table[@id='customers']//tr/td")).size();
		
//		How do you run the failed test cases alone in TestNG?
		// testng-failed.xml file can be used to rerun all failed test cases
		
//		I have a bunch of test cases. I want to run only one test case in first priority. How do you run?
		// @Test(priority=-100000)
	}
}
