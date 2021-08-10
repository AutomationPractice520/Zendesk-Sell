package main.java.pageEvents;

import main.java.pageObjects.SettingsPageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import org.openqa.selenium.Keys;
import test.java.BaseTest;

public class SettingsPageEvents {

    public void clickOnSettingsButtonAndChangeLeadStatus(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info(" Settings -> Leads -> Lead statuses and changing the name of the \"New\" status to \"Authorized\" status.");
        elementFetch.getWebElement("XPATH", SettingsPageElements.settingsButton).click();
        elementFetch.getWebElement("CSS", SettingsPageElements.leadsButton).click();
        elementFetch.getWebElement("CSS", SettingsPageElements.leadStatusTab).click();
        elementFetch.getWebElement("XPATH", SettingsPageElements.editLeadStatus).click();
        elementFetch.getWebElement("XPATH", SettingsPageElements.nameTextBox).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), Constants.updateStatus);
        elementFetch.getWebElement("XPATH", SettingsPageElements.saveButton).click();
    }
}
