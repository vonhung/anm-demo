package obe.tracker;

import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.OBE.HomePageObject;
import pageObjects.OBE.PageGeneratorManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

public class T01_View_Product extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })

	@BeforeClass
	
		public void initBrowser(String browserName, String appURL) {
			log.info("Pre-Condition - Open browser '" + browserName + "' and navigate to '" + appURL + "'");
			driver = getBrowserDriver(browserName, appURL);
			driver.manage().window().maximize();
			homePage = PageGeneratorManager.getHomePage(driver);

		}

	@Test
	public void TC_01_Homepage_Widget() {
	//	homePage.sleepInSecond(5);
//		log.info("TC_01 - Step 01: Verify banner homepage displayed");
//		verifyTrue(homePage.isHomepageBannerDisplayed());
		
		log.info("TC_01 - Step 02: Verify if PA tag is injected");
		verifyTrue(homePage.isPATagInjected());	
		
		log.info("TC_01 - Step 03: Verify if Cohort is Normal");
		verifyTrue(homePage.isCohortNormal());

		log.info("TC_01 - Step 04: Verify if Homepage Widget is displayed");
		verifyTrue(homePage.isPAHomepageWidgetDisplayed());
		
		log.info("TC_01 - Step 05: Verify if PA HomepageWidget has arrows");
		verifyTrue(homePage.isPAArrowsDisplayed());
		
		log.info("TC_01 - Step 06: Click on arrow to see more slots");
		homePage.clickOnPAArrow();
		
//		log.info("TC_01 - Step 07: Verify slotImpression events are sent");
//		
//		log.info("TC_01 - Step 07: Click to on a slot");
		
	}

//	@AfterClass
//	public void cleanBrowser() {
//		log.info("Post-Condition: Close browser");
//		driver.quit();
//	}
}
