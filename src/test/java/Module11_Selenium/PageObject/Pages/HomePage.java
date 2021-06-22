package Module11_Selenium.PageObject.Pages;

import Module11_Selenium.PageObject.WebDriverUtils;

public class HomePage {

    public static final String SHOP_URL = "http://automationpractice.com/";
    public static final String SEARCH = "//input [@class='search_query form-control ac_input']";

    private WebDriverUtils driver;

    public HomePage(WebDriverUtils webDriver) {
        this.driver = webDriver;
    }

    public void initiateHomePage() {
        driver.initiateHomePage(SHOP_URL);
    }

    public SearchCatalogPage goToSearch(String input) throws InterruptedException {
        driver.sendInput(SEARCH, input);
        return new SearchCatalogPage(driver);
    }



}
