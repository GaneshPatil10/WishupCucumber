package org.applicationHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;
import org.utilities.configReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	public static Properties prop;
	configReader cr;
	BaseUtility bu;
	public static WebDriver driver;
	@Before(order=0)
	public void lunchBrowser() {
		cr = new configReader();
		bu = new BaseUtility();
		driver = bu.startUp(cr.getTestData("browserName"), cr.getTestData("url"));
		
	}
	@After(order=0)
	public void tearDown() {
		driver.quit();
	}
	@After(order=1)
	public void takeScreenshot(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			String sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			scenario.attach(sourcePath, "image/png", screenshotName);
			/*try {
				//code for taking screenshot
				File scn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scn, new File(System.getProperty("user.dir")
						+"\\screenshots\\screenshotName_DateTimeStamp.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
	}
}