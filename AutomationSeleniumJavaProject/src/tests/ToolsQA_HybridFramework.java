package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.Constants;
import data.TestDataPool;
import pageFlows.AutomationPracticeFormPage;
import setup.TestRunSetup;
import utils.PropertyUtils;

public class ToolsQA_HybridFramework {

	public static void main(String[] args) {

		System.out.println("*** Start ToolsQA Automation Test ***");

		// Setup
		WebDriver driver = null;

		try {
			//Config
			new TestDataPool(1);
			driver = TestRunSetup.launchBrowser(PropertyUtils.propertyFile_Read(Constants.CONFIG_PATH, "browser"), Constants.BASE_URL);

			// Test steps
			AutomationPracticeFormPage.PracticeAutomationForm(driver);

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.close();
			System.out.println("*** End ToolsQA Automation Test ***");
		}

	}

}
