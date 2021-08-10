package main.java.pageEvents;

import main.java.pageObjects.SellPageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.BaseTest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SellPageEvents {

    public void clickOnAddNewLeadButton(){
        BaseTest.logger.info("Moving to Adding New Leads Section.");
        BaseTest.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Set<String> handleswindow = BaseTest.driver.getWindowHandles();
        for(String windowHandle : handleswindow)
        {
            BaseTest.driver.switchTo().window(windowHandle);
        }
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", SellPageElements.addDropdownButton).click();
        elementFetch.getWebElement("XPATH", SellPageElements.addLeadsButton).click();
    }

    public void addNewLead(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering Lead details and creating New Lead.");
        elementFetch.getWebElement("XPATH", SellPageElements.firstName).sendKeys(Constants.firstName);
        elementFetch.getWebElement("XPATH", SellPageElements.lastName).sendKeys(Constants.lastName);
        elementFetch.getWebElement("XPATH", SellPageElements.mobileNo).sendKeys(Constants.mobileNo);
        elementFetch.getWebElement("XPATH", SellPageElements.workNo).sendKeys(Constants.workNo);
        elementFetch.getWebElement("XPATH", SellPageElements.companyName).sendKeys(Constants.companyName);
        elementFetch.getWebElement("XPATH", SellPageElements.emailAddress).sendKeys(Constants.emailAddress);
        elementFetch.getWebElement("XPATH", SellPageElements.title).sendKeys(Constants.title);
        elementFetch.getWebElement("XPATH", SellPageElements.sourceDropdown).click();
        elementFetch.getWebElement("XPATH", SellPageElements.noSourceSelect).click();
        //elementFetch.getWebElement("XPATH", SellPageElements.searchSourceDropdown).sendKeys(Constants.source);
        //elementFetch.getWebElement("XPATH", SellPageElements.addNewSourceButton).click();
        elementFetch.getWebElement("XPATH", SellPageElements.industryDropdown).click();
        elementFetch.getWebElement("XPATH", SellPageElements.searchIndustryDropdown).sendKeys(Constants.industrySelect);
        elementFetch.getWebElement("XPATH", SellPageElements.selectIndustry).click();
        elementFetch.getWebElement("XPATH", SellPageElements.address).click();

        JavascriptExecutor jsExecutor = (JavascriptExecutor)BaseTest.driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView();", elementFetch.getWebElement("XPATH", SellPageElements.statusDropdown));

        elementFetch.getWebElement("XPATH", SellPageElements.street).sendKeys(Constants.street);
        elementFetch.getWebElement("XPATH", SellPageElements.city).sendKeys(Constants.city);
        elementFetch.getWebElement("XPATH", SellPageElements.postalCode).sendKeys(Constants.postalCode);
        elementFetch.getWebElement("XPATH", SellPageElements.state).sendKeys(Constants.state);
        elementFetch.getWebElement("XPATH", SellPageElements.countryDropdown).click();
        elementFetch.getWebElement("XPATH", SellPageElements.searchCountryDropdown).sendKeys(Constants.country);
        elementFetch.getWebElement("XPATH", SellPageElements.selectCountry).click();


        elementFetch.getWebElement("CSS", SellPageElements.tags).click();
        elementFetch.getWebElement("XPATH", SellPageElements.addLeadTag).click();
        //elementFetch.getWebElement("XPATH", SellPageElements.addNewTag).click();
        elementFetch.getWebElement("XPATH", SellPageElements.statusDropdown).click();
        elementFetch.getWebElement("XPATH", SellPageElements.selectStatus).click();

        jsExecutor.executeScript("arguments[0].scrollIntoView();", elementFetch.getWebElement("XPATH", SellPageElements.website));

        elementFetch.getWebElement("XPATH", SellPageElements.website).sendKeys(Constants.website);
        elementFetch.getWebElement("XPATH", SellPageElements.saveAndViewLeadButton).click();
    }
}
