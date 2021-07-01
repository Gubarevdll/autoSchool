package Module11_Selenium.PageObject;

import com.google.common.collect.Ordering;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;

public class WebDriverUtils {

    public static final int UI_INTERACTION_PAUSE = 1000;

    WebDriver driver;
    WebDriverWait webDriverWait;

    public WebDriverUtils() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, 10);
    }

    public void initiateHomePage(String url) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void sendInput (String field, String input) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(field));
        element.sendKeys(input, Keys.ENTER);
        Thread.sleep(UI_INTERACTION_PAUSE);
    }

    public void clickElement (String element) throws InterruptedException {
        WebElement webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView({ block: 'center' });", element);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", webElement);
        Thread.sleep(UI_INTERACTION_PAUSE);
    }

    public List<WebElement> getAllElements(String xpath) {
        return new ArrayList<>(driver.findElements(By.xpath(xpath)));
    }
    public void refreshPage() {
        driver.navigate().refresh();
    }

    public WebElement getElement(String pathLocation) {
        return driver.findElement(By.xpath(pathLocation));
    }

    public List<String> getAttributesNames(List<WebElement> elements, String attributeName) {
        return elements.stream().map(e -> e.getAttribute(attributeName)).collect(Collectors.toList());
    }
    public static final String CONTAINER = "//div[@ class='product-container']";

    public void test () {
        List<WebElement> elements = getAllElements(CONTAINER);
        System.out.println(elements.get(0).getAttribute("price product-price"));
        System.out.println(elements.get(1).getAttribute("price product-price"));
        System.out.println(elements.get(2).getAttribute("price product-price"));
        System.out.println(elements.get(3).getAttribute("price product-price"));
    }

    public void quitDriver() {
        driver.quit();
    }

}
