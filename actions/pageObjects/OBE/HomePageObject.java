package pageObjects.OBE;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.OBE.HomePageUI;

public class HomePageObject extends BasePage {

		WebDriver driver;
		
		public HomePageObject (WebDriver driver) {
			this.driver = driver;
		}

		public boolean isHomepageBannerDisplayed() {
			return isElementDisplayed(driver, HomePageUI.HOME_BANNER  );
		}


}
