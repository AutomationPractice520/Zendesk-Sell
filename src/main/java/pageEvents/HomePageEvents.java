package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

public class HomePageEvents {

    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering subdomain and Signing in on Zendesk Homepage.");
        elementFetch.getWebElement("ID", HomePageElements.cookieOkButton).click();
        elementFetch.getWebElement("ID", HomePageElements.subdomainTextBox).sendKeys(Constants.homePageSignIn);
        elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
    }
}
