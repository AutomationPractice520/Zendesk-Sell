package main.java.pageObjects;

public interface SettingsPageElements {
    String settingsButton = "//*[@id=\"nav-settings\"]/button";
    String leadsButton = "a[href='/settings/leads']";
    String leadStatusTab = "a[href='#lead-status']";
    String editLeadStatus = "//*[@id=\"lead-status\"]//div/div[contains(string(),\"New\")]//button";
    String nameTextBox = "//*[@data-current-value=\"New\"]";
    String saveButton = "//*[@id=\"lead-status\"]/div[1]//div[3]/div/button";

}
