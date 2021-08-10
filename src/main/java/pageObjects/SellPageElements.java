package main.java.pageObjects;

public interface SellPageElements {
    String addDropdownButton = "//button[@data-test-id =\"global-add-button\"]";
    String addLeadsButton = "//div[@data-item-index = \"0\"]";
    String firstName = "//*[@placeholder=\"First Name\"]";
    String lastName = "//*[@placeholder=\"Last Name\"]";
    String mobileNo = "//section/div/div[1]/div/div[2]/div/div[1]/div/div[1]//div/input";
    String workNo = "//section/div/div[1]/div/div[2]/div/div[1]/div/div[2]//div/input";
    String companyName = "//*[@placeholder=\"Add company to search by name...\"]";
    String emailAddress = "//*[@placeholder=\"Type an email to search Reach...\"]";
    String title = "//div/section/div/div[1]//div[2]/div/input";
    String sourceDropdown = "//span[contains (@ data-action, 'lead-source-dropdown')]";
    String noSourceSelect = "//div[contains(text(),'No source')]";
    String industryDropdown = "//span[contains (@ data-action, 'industry-dropdown')]";
    String searchIndustryDropdown = "//*[@placeholder=\"Search...\"]";
    String selectIndustry = "//div[contains(text(),'Financial Services')]";
    String address = "//*[@placeholder=\"Street, city, zip\"]";
    String street = "//div/div[1]/div/div[2]/div/div[4]/div/div/div[1]/div/div/div[2]/div/input";
    String city = "//div/div[1]/div/div[2]/div/div[4]//div[2]/div[1]/div/div[1]/div[2]/div/input";
    String postalCode = "//div/div[1]//div[2]/div[1]/div/div[2]/div[2]/div/input";
    String state = "//div[2]/div[2]/div/div[1]/div[2]/div/input";
    String countryDropdown = "//span[contains (@ data-action, 'address-country-input')]";
    String searchCountryDropdown = "//*[@placeholder=\"Search...\"]";
    String selectCountry = "//span[contains(text(),'Poland')]";
    String tags = "input._30W--MultiItemInput--input";
    String addLeadTag = "//div[contains(text(),'Add lead')]";
    String statusDropdown = "//section/div/div[3]/div/div[1]/div/div/div[2]/span/button";
    String selectStatus = "//div[contains(text(),'New')]";
    String website = "//div/section/div/div[3]//div/input";
    String saveAndViewLeadButton = "//div[3]/div/div/button[2]";
}
