package testNGPack;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledAndPriority {

	// -n 0 +n

	@Test(priority = -100)
	public void installApp() {
		System.out.println("installApp");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "installApp" }, priority = 2)
	public void changeTestConfig() {
		System.out.println("changeTestConfig");
	}

	@Test(dependsOnMethods = { "installApp" }, enabled = false, priority = 3)
	public void somreMoreTest() {
		System.out.println("somreMoreTest");
	}

	@Test(dependsOnMethods = { "installApp" }, priority = 100)
	public void uninstallApp() {
		System.out.println("uninstallApp");
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}
	
	// Grid, Proxy, Explicit, locators

}
