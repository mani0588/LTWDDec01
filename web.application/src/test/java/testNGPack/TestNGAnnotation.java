package testNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@BeforeClass
	public void beforeClass() {
		System.out.println("at the begining of the class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test
	public void verifyLogin() {
		System.out.println("verifyLogin");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("at the end of the class");
	}

//	@BeforeTest
//	public void beforeTest() {
//	}
//
//	@AfterTest
//	public void afterTest() {
//	}
//
//	@BeforeSuite
//	public void beforeSuite() {
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//	}

}
