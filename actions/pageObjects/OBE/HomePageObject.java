package pageObjects.OBE;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.OBE.HomePageUI;

public class HomePageObject extends BasePage {

	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isHomepageBannerDisplayed() {
		return isElementDisplayed(driver, HomePageUI.HOME_BANNER);
	}

	public boolean isPATagInjected() {

		int tagSize = getElementSize(driver, HomePageUI.PA_TAG);
		if (tagSize > 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isCohortNormal() {
		String configData = getLocalStorage(driver, "48513eea-04be-eb11-aaaa-0226453f4eea");
		System.out.println("configData print: " + configData);
		return configData.contains("\"cc\":1");
	}

	public boolean isPAHomepageWidgetDisplayed() {
		return isElementDisplayed(driver, HomePageUI.PA_HOME_WIDGET);
	}

	public boolean isPAArrowsDisplayed() {
		return isElementDisplayed(driver, HomePageUI.PA_HOME_WIDGET_ARROW);
	}

	public void clickOnPAArrow() {
		waitForElementVisible(driver, HomePageUI.PA_HOME_WIDGET_ARROW);
		clickToElementByJS(driver, HomePageUI.PA_HOME_WIDGET_ARROW);
	}

}
