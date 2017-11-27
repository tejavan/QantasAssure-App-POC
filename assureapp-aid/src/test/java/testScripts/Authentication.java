package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import functionLibrary.CustomMethods;
import objectRepository.AppObjectsRepository;

public class Authentication extends CustomMethods {

	AppObjectsRepository objRep = new AppObjectsRepository();
	CustomMethods appActions = new CustomMethods();

	public void loginScreen() throws InterruptedException {

		if (appActions.readText("Log in")) {
			driver.findElement(objRep.QffID).sendKeys("1943104842");
			driver.findElement(objRep.lastName).sendKeys("reedone");
			driver.findElement(objRep.pin).sendKeys("1234");
			WebDriverWait waitbu = new WebDriverWait(driver, 2);
			waitbu.until(ExpectedConditions.visibilityOfElementLocated(objRep.loginButton)).click();
			Thread.sleep(5000);
			Assert.assertTrue(appActions.readText("Challenges"));
			if (appActions.readText("OK_GOT_IT")) {
				for (int i = 0; i <= 5; i++) {
					System.out.println("t1");
					if (appActions.readText("OK_GOT_IT")) {
						System.out.println("t2");
						WebDriverWait waitFormessage = new WebDriverWait(driver, 2);
						waitFormessage.until(ExpectedConditions.visibilityOfElementLocated(objRep.OK_GOT_IT)).click();
					}
				}
			} else {
				System.out.println("Currently app not showing any motivational messages on the screen");
			}

		}

		else if (appActions.readText("Daily Challenge"))

		{

			System.out.println("User already logged in");
			for (int i = 0; i <= 5; i++) {
				System.out.println("t1");
				if (appActions.readText("OK_GOT_IT")) {
					System.out.println("t2");
					WebDriverWait waitFormessage = new WebDriverWait(driver, 2);
					waitFormessage.until(ExpectedConditions.visibilityOfElementLocated(objRep.OK_GOT_IT)).click();
				} else {
					System.out.println("Currently app not showing any popup messages on the screen");
				}
			}

		} else {
			System.out.println("Authentication failing due to others issues");
		}
	}

}
