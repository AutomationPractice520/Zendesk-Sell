package main.java.pageEvents;

import main.java.pageObjects.GetStartedPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

import java.util.concurrent.TimeUnit;

public class GetStartedPageEvents {

    public void findAndClickOnSellApplicationButton(){
        BaseTest.logger.info("Clicking on Zendesk Sell Application link.");
        BaseTest.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", GetStartedPageElements.viewBox).click();
        elementFetch.getWebElement("XPATH", GetStartedPageElements.sellClickButton).click();
    }
}
