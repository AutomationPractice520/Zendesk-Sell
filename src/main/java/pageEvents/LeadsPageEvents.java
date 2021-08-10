package main.java.pageEvents;

import main.java.pageObjects.LeadsPageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseTest;

public class LeadsPageEvents {

    public void clickOnLeadsAndCheckNewStatus(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Moving to Lead details page.");
        elementFetch.getWebElement("XPATH", LeadsPageElements.leadsButton).click();
        elementFetch.getWebElement("XPATH", LeadsPageElements.clearAllFilters).click();
        String status = elementFetch.getWebElement("XPATH", LeadsPageElements.statusField).getText();
        Assert.assertEquals(status, Constants.newStatus,"Lead Status is not set to \"New\".");
        BaseTest.logger.info("Lead status visible on the details page is set to \"New\".");
    }

    public void clickOnLeadsAndCheckUpdatedStatus(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Moving to Lead details page.");
        elementFetch.getWebElement("XPATH", LeadsPageElements.leadsButton).click();
        String status = elementFetch.getWebElement("XPATH", LeadsPageElements.statusField).getText();
        Assert.assertEquals(status, Constants.updateStatus,"Lead Status change is not reflected on Leads Details Page.");
        BaseTest.logger.info("Lead Status change is reflected correctly on the Leads Details Page.");
    }
}
