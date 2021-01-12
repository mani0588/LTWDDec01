package testNGPack;

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
//		How do you handle the dynamic elements?
//		What is the difference between close and quit methods?
//		What is the difference between implicit and explicit wait?
//		What are all the different selenium exceptions you faced?
//		How do you get the title and url of the browser?
//		How do you take the screenshot?
//		Tell us some of the TestNG annotations
//		How many test cases you will automate per day?
//		What is the difference between xpath and CSS selector?
//		How many locators you have in Selenium? which locators do you use and why?
//		What is the difference between / and //?
//		How do you change the attributes of an element?
//		How do you enter value into text box without using send keys?
//		(alternative question: Send keys is not working then how do you enter values?)
//		How do you handle the webtables? (get number of rows/columns/cells)
//		How do you run the failed test cases alone in TestNG?
//		I have a bunch of test cases. I want to run only one test case in first priority. How do you run?

	}
}
