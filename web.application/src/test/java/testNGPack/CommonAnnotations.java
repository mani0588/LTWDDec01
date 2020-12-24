package testNGPack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class CommonAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite - at the begining of your execution");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest - before your group of classes");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest - after your group of classes");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite - at the end of your execution");
	}

}
