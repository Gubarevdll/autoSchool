package Module11_Selenium;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Comparator;

public class Webdriver {

    @Test
    public void testLocator() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");
        SoftAssert softAssert = new SoftAssert();

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        searchField.sendKeys("Summer");

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

        softAssert.assertTrue(sorted==pricesFromBoard);

        String firstElementName = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText();
        String firstElementPrice = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[1]/span[2]")).getText();

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));

        softAssert.assertAll();
    }

}