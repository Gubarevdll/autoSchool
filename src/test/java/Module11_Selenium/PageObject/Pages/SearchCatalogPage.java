package Module11_Selenium.PageObject.Pages;

import Module11_Selenium.PageObject.WebDriverUtils;
import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchCatalogPage {

    public static final String SEARCH = "//input [@class='search_query form-control ac_input']";
    public static final String SORT_BUTTON = "//select [@ id='selectProductSort']";
    public static final String SORT_HIGHEST_FIRST = "//option [@value='price:desc']";
    public static final String PRICES = "//div[@itemprop='offers']/span [@class='price product-price']";
    public static final String CONTAINER = "//div[@ class='product-container']";
    private WebDriverUtils driver;

    public SearchCatalogPage(WebDriverUtils webDriver) {
        this.driver = webDriver;
    }

    public void validateInput(String expected) {
        assertEquals(driver.getElement(SEARCH).getAttribute("value"), expected);
    }

    public void sortHighestFirst () throws InterruptedException {
        driver.clickElement(SORT_BUTTON);
        driver.clickElement(SORT_HIGHEST_FIRST);
    }


    public void validateSortOrder() {
        driver.test();
//        List<WebElement> elements = driver.getAllElements(CONTAINER);
//        System.out.println(elements.get(0).findElements(By.xpath("//span[@class='price product-price']")));
//        List<String> folderNames = driver.getAttributesNames(elements, FOLDER_NAME_ATTRIBUTE). //here will be price nmae
//                stream().map(e -> e.toLowerCase(Locale.ROOT)).collect(Collectors.toList());
//        assertTrue(Ordering.natural().isOrdered(folderNames));
    }

}
