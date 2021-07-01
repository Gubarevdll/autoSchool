package Module11_Selenium.PageObject;

import Module11_Selenium.PageObject.Pages.HomePage;

import Module11_Selenium.PageObject.Pages.SearchCatalogPage;
import org.testng.annotations.Test;

public class TestRunner {

    WebDriverUtils driverUtils = new WebDriverUtils();
    private HomePage homePage = new HomePage(driverUtils);
    private SearchCatalogPage searchCatalogPage;

    @Test //TODO change to beforeClass
    public void test () throws InterruptedException {
        homePage.initiateHomePage();
        searchCatalogPage = homePage.goToSearch("Summer");
        searchCatalogPage.validateInput("Summer");
//        searchCatalogPage.sortHighestFirst();
        searchCatalogPage.validateSortOrder();
    }
}
