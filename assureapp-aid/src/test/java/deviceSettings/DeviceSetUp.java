package deviceSettings;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import functionLibrary.CustomMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DeviceSetUp extends CustomMethods {

	public void setup() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("platformName", "iOS");
		dc.setCapability("udid", "5531649a14ec22d550ec744147cf9cd153b111a3");
		dc.setCapability("deviceName", "Assure Test iPhone7");
		dc.setCapability("bundleId", "com.qantas.assure-dev");
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability(MobileCapabilityType.UDID, "5531649a14ec22d550ec744147cf9cd153b111a3");
		driver = new IOSDriver<IOSElement>(new URL("http://localhost:4723/wd/hub"), dc);

	}

}
