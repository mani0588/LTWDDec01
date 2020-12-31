package selPack;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProxyExample {

	public static void main(String[] args) {

		Proxy proxy = new Proxy();
		proxy.setHttpProxy("abc.proxy.com:1234");
		proxy.setFtpProxy("xyz.proxy.com:1235");
		proxy.setSslProxy("xyz.proxy.com:1236");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(cap);

	}

}
