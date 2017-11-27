package functionLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class CustomMethods {

	public static IOSDriver<IOSElement> driver = null;

	public void tapItem(By locator) {

		driver.findElement(locator).click();
	}

	// public void enterText(IOSDriver<IOSElement> driver, By locator, String text)
	// {
	// driver.findElement(locator).sendKeys(text);
	// }

	public boolean readText(String textItem) {
		return driver.getPageSource().contains(textItem);
	}

	// public void imageRecognization(String imagepath) throws
	//
	// {
	//
	// File file = new File(imagepath);
	// if (file.isDirectory())
	// file = file.getParentFile();
	// if (file.exists()) {
	// System.out.println("Files exists at given path");
	// Screen screen = new Screen();
	// Pattern image = new Pattern(imagepath);
	// screen.wait(image, 5000);
	// screen.click(image);
	//
	// } else
	// System.out.println("File does not exists at the give path");
	//
	// }

	// public void captureScreenShot(String filepath) {
	//
	// try {
	//
	// WebDriver augmentedDriver = new Augmenter().augment(driver);
	// File source = ((TakesScreenshot)
	// augmentedDriver).getScreenshotAs(OutputType.FILE);
	//
	// File source = ts.getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(source, new File(filepath));
	//
	// } catch (Exception e) {
	// System.out.println("Exception " + e.toString());
	// }
	// }

	public void verticalSwipe() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		//System.out.println("height" + height);
		//System.out.println("width" + width);

		int x = width / 2;
		int starty = (int) (height * 0.50);
		int endy = (int) (height * 0.40);
		//System.out.println("x" + x);
		//System.out.println("starty" + starty);
		//System.out.println("endy" + endy);
		driver.swipe(x, starty, x, endy, 200);
	}
}
