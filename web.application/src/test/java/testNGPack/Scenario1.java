package testNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Scenario1 - at the begining of the class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Scenario1 - beforeMethod");
	}

	@Test
	public void verifyLogin() {
		System.out.println("Scenario1 - verifyLogin");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Scenario1 - afterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Scenario1 - at the end of the class");
	}

}
