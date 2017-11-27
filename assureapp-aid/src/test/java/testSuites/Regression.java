package testSuites;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import deviceSettings.DeviceSetUp;
import testScripts.Authentication;
import testScripts.DailyChallenge;

public class Regression {

	DeviceSetUp loadDevice = new DeviceSetUp();
	DailyChallenge changeDC = new DailyChallenge();
	Authentication auth = new Authentication();

	@BeforeMethod
	public void setUpdevice() throws MalformedURLException {
		loadDevice.setup();

	}

	@Test(alwaysRun = true, priority = 1)
	public void loginToApp() throws InterruptedException {
		auth.loginScreen();
	}

	@Test(alwaysRun = true, priority = 2)
	public void changeDailyChallengeActivity() throws InterruptedException {
		changeDC.editDailyChallenge();
	}

}
