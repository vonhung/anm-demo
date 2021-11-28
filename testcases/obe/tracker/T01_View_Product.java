package obe.tracker;

import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.OBE.HomePageObject;
import pageObjects.OBE.PageGeneratorManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

public class T01_View_Product extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })

	@BeforeClass
	
		public void initBrowser(String browserName, String appURL) {
			log.info("Pre-Condition - Open browser '" + browserName + "' and navigate to '" + appURL + "'");
			driver = getBrowserDriver(browserName, appURL);

		//	driver.manage().window().maximize();

			homePage = PageGeneratorManager.getHomePage(driver);

		}

	@Test
	public void TC_01_View_From_PLP() {
		log.info("TC_01 - Step 01: Verify banner homepage displayed");
		verifyTrue(homePage.isHomepageBannerDisplayed());

		log.info("TC_01 - Step 02: Click to expand Menu");
	}

	@AfterClass
	public void cleanBrowser() {
		log.info("Post-Condition: Close browser");
		driver.quit();
	}
}
