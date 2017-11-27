package testScripts;
//package TestScripts;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.ios.IOSElement;
//import methodFactory.BaseActions;
//import objectRepository.AppObjectsRepository;
//
//public class WeeklyChallenge {
//
//	IOSDriver driver = null;
//
//	AppObjectsRepository objRep = new AppObjectsRepository();
//	BaseActions actions = new BaseActions();
//
//	
//	public void editWeeklyActivity() {
//
//		actions.tapItem(driver, objRep.DailyChallengeTile);
//
//		// Current Activity is steps then change to Cycling
//		if (driver.getPageSource().contains("STEPS")) {
//
//			actions.tapItem(driver, objRep.Edit);
//			actions.tapItem(driver, objRep.EditActivity);
//			actions.tapItem(driver, objRep.Cycling);
//			actions.tapItem(driver, objRep.Next);
//			actions.tapItem(driver, objRep.ChangeActivity);
//			actions.tapItem(driver, objRep.Update);
//			actions.verticalSwipe(driver);
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(objRep.OK_GOT_IT)).click();
//			WebDriverWait waitforTab = new WebDriverWait(driver, 10);
//			waitforTab.until(ExpectedConditions.visibilityOfElementLocated(objRep.ChallengesTab)).click();
//
//		}
//
//		// Current Activity is Cycling then change to Swimming
//		else if (driver.getPageSource().contains("KM")) {
//			actions.tapItem(driver, objRep.Edit);
//			actions.tapItem(driver, objRep.EditActivity);
//			actions.tapItem(driver, objRep.Swimming);
//			actions.tapItem(driver, objRep.Next);
//			actions.tapItem(driver, objRep.ChangeActivity);
//			actions.verticalSwipe(driver);
//			actions.tapItem(driver, objRep.Update);
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(objRep.OK_GOT_IT)).click();
//			WebDriverWait waitforTab = new WebDriverWait(driver, 10);
//			waitforTab.until(ExpectedConditions.visibilityOfElementLocated(objRep.ChallengesTab)).click();
//			// actions.tapItem(driver, objRep.ChallengesTab);
//		}
//
//		// Current Activity is Swimming then change to Steps
//		else if (driver.getPageSource().contains("MIN")) {
//			actions.tapItem(driver, objRep.Edit);
//			actions.tapItem(driver, objRep.EditActivity);
//			actions.tapItem(driver, objRep.Steps);
//			actions.tapItem(driver, objRep.Next);
//			actions.tapItem(driver, objRep.ChangeActivity);
//			actions.verticalSwipe(driver);
//			actions.tapItem(driver, objRep.Update);
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(objRep.OK_GOT_IT)).click();
//			WebDriverWait waitforTab = new WebDriverWait(driver, 10);
//			waitforTab.until(ExpectedConditions.visibilityOfElementLocated(objRep.ChallengesTab)).click();
//		} else {
//			System.out.println("failed to change the activity");
//		}
//	}
//
//}
