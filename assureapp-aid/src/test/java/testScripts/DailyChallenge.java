package testScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import functionLibrary.CustomMethods;
import junit.framework.Assert;
import objectRepository.AppObjectsRepository;

public class DailyChallenge extends CustomMethods {

	AppObjectsRepository objRep = new AppObjectsRepository();
	CustomMethods appActions = new CustomMethods();

	public void editDailyChallenge() throws InterruptedException {

		appActions.tapItem(objRep.DailyChallengeTile);
		Thread.sleep(5000);

		if (appActions.readText("OK, GOT IT")) {
			System.out.println("App showing edit fetaure hint screen");
			WebDriverWait waitFormessage = new WebDriverWait(driver, 2);
			waitFormessage.until(ExpectedConditions.visibilityOfElementLocated(objRep.hintScreen)).click();
		} else {
			System.out.println("App not showing any edit feature hint screen");
		}

		// // Current Activity is steps then change to Cycling
		if (appActions.readText("STEPS")) {

			appActions.tapItem(objRep.Edit);
			appActions.tapItem(objRep.EditActivity);
			appActions.tapItem(objRep.Cycling);
			appActions.tapItem(objRep.Next);
			appActions.tapItem(objRep.ChangeActivity);
			appActions.verticalSwipe();
			appActions.tapItem(objRep.Update);
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.visibilityOfElementLocated(objRep.OK_GOT_IT)).click();
			Assert.assertTrue(appActions.readText("KM"));
			appActions.tapItem(objRep.ChallengesTab);

		}

		// // Current Activity is Cycling then change to Swimming
		else if (appActions.readText("KM")) {
			appActions.tapItem(objRep.Edit);
			appActions.tapItem(objRep.EditActivity);
			appActions.tapItem(objRep.Swimming);
			appActions.tapItem(objRep.Next);
			appActions.tapItem(objRep.ChangeActivity);
			appActions.verticalSwipe();
			appActions.tapItem(objRep.Update);
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.visibilityOfElementLocated(objRep.OK_GOT_IT)).click();
			Assert.assertTrue(appActions.readText("MIN"));
			appActions.tapItem(objRep.ChallengesTab);
		}

		// Current Activity is Swimming then change to Steps
		else if (appActions.readText("MIN")) {
			appActions.tapItem(objRep.Edit);
			appActions.tapItem(objRep.EditActivity);
			appActions.tapItem(objRep.Steps);
			appActions.tapItem(objRep.Next);
			appActions.tapItem(objRep.ChangeActivity);
			appActions.verticalSwipe();
			appActions.tapItem(objRep.Update);
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.visibilityOfElementLocated(objRep.OK_GOT_IT)).click();
			Assert.assertTrue(appActions.readText("STEPS"));
			appActions.tapItem(objRep.ChallengesTab);
		} else {
			System.out.println("failed to change the activity");
		}

	}

}
