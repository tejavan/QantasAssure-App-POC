package objectRepository;

import org.openqa.selenium.By;

public class AppObjectsRepository {

	// Daily Challenge
	public By DailyChallengeTile = By.xpath("//XCUIElementTypeStaticText[@name='Daily Challenge']");
	public By Edit = By.xpath("//XCUIElementTypeButton[@name='Edit']");
	public By EditActivity = By.xpath("//XCUIElementTypeButton[@label='EDIT ACTIVITY']");
	public By Cycling = By.xpath("//XCUIElementTypeStaticText[@name='Cycling']");
	public By Swimming = By.xpath("//XCUIElementTypeStaticText[@name='Swimming']");
	public By Steps = By.xpath("//XCUIElementTypeStaticText[@name='Steps']");
	public By Next = By.xpath("//XCUIElementTypeButton[@label='NEXT']");
	public By ChangeActivity = By.xpath("//XCUIElementTypeButton[@label='CHANGE ACTIVITY']");
	public By Update = By.xpath("//XCUIElementTypeButton[@label='UPDATE']");
	public By OK_GOT_IT = By.xpath("//XCUIElementTypeButton[@label='OK, GOT IT']");
	public By ChallengesTab = By.xpath("//XCUIElementTypeButton[@name='HOME_TAB_CHALLENGE']");
	public By hintScreen = By.xpath("//XCUIElementTypeButton[@label='OK, GOT IT']");

	// DashBoard
	public By FriendStepChallenge = By.xpath("//XCUIElementTypeButton[@name='HOME_TAB_CHALLENGE']");

	// Login Screen
	public By QffID = By.name("LOGIN_QFF_TEXT");
	public By lastName = By.name("LOGIN_LASTNAME");
	public By pin = By.name("LOGIN_QFF_PIN_TEXT");
	public By loginButton = By.xpath("//XCUIElementTypeButton[@label='LOG ME IN']");
}
