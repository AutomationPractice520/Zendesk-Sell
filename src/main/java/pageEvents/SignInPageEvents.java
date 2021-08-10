package main.java.pageEvents;

import main.java.pageObjects.SignInPageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

import java.util.concurrent.TimeUnit;

public class SignInPageEvents {

     public void enterUserDetailsAndSignIn(){
        BaseTest.logger.info("Entering Email/Password and Signing in on Zendesk SignIn Page.");
        BaseTest.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BaseTest.driver.switchTo().frame(0);
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", SignInPageElements.email).sendKeys(Constants.email);
        elementFetch.getWebElement("ID", SignInPageElements.password).sendKeys(Constants.password);
        elementFetch.getWebElement("ID", SignInPageElements.signInButton).click();
    }
}
