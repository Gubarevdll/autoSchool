package Module11_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

    @Test
    public void testLocator() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

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

    }
}