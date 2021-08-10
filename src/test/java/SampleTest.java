package test.java;

import main.java.pageEvents.*;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void zendeskSellStatusCheck(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignInButton();

        SignInPageEvents signInPageEvents = new SignInPageEvents();
        signInPageEvents.enterUserDetailsAndSignIn();

        GetStartedPageEvents getStartedPageEvents = new GetStartedPageEvents();
        getStartedPageEvents.findAndClickOnSellApplicationButton();

        SellPageEvents sellPageEvents = new SellPageEvents();
        sellPageEvents.clickOnAddNewLeadButton();
        sellPageEvents.addNewLead();

        LeadsPageEvents leadsPageEvents = new LeadsPageEvents();
        leadsPageEvents.clickOnLeadsAndCheckNewStatus();

        SettingsPageEvents settingsPageEvents = new SettingsPageEvents();
        settingsPageEvents.clickOnSettingsButtonAndChangeLeadStatus();

        leadsPageEvents.clickOnLeadsAndCheckUpdatedStatus();
    }

}
