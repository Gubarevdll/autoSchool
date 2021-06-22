package Module11_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Comparator;

public class Webdriver {


    @Parameters ({"Summer"})

    @Test
    public void testLocator(String Summer) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        searchField.sendKeys(Summer);

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
        searchButton.click();

        String actualString = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText();
        assert (actualString.contains("SUMMER"));

        WebElement sortButton = driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]"));
        sortButton.click();

        WebElement highestFirst = driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]/option[3]"));
        highestFirst.click();

        ArrayList<String> pricesFromBoard = new ArrayList<String>();
        pricesFromBoard.add(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[1]/span[2]")).getText());
        pricesFromBoard.add(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[1]/span")).getText());
        pricesFromBoard.add(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[1]/span[2]")).getText());
        pricesFromBoard.add(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[1]/span")).getText());
        ArrayList<String> sorted = new ArrayList(pricesFromBoard);
        sorted.sort(Comparator.reverseOrder());

        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(sorted==pricesFromBoard);

        String firstElementName = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText();
        System.out.println(firstElementName);
        String firstElementPrice = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[1]/span[2]")).getText();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);

        WebDriverWait wait10 = new WebDriverWait(driver, 10);
        WebElement closeWindowButton = wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click();", closeWindowButton);

        WebElement openCart = wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")));
        openCart.click();

        wait10.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"total_price\"]"))));
        WebElement tatalElement = driver.findElement(By.xpath("//*[@id=\"total_price\"]"));
        String totalString = tatalElement.getText();
        System.out.println("Total sum = "+ totalString);

        wait10.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"product_5_19_0_0\"]/td[2]/p/a"))));
        WebElement inCartName = driver.findElement(By.xpath("//*[@id=\"product_5_19_0_0\"]/td[2]/p/a"));
        String inCartNameString = inCartName.getText();
        System.out.println("Name = "+ inCartNameString);

        assertion.assertTrue(inCartNameString.equals(firstElementName));
        assertion.assertTrue(totalString==firstElementPrice);

        assertion.assertAll();
    }

}