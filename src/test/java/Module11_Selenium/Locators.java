package Module11_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    @Test
    public void testLocator() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

        WebElement dressesButton = driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a"));

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

        searchField.sendKeys("summer");
        searchButton.click();

        WebElement sortButton = driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]"));
        sortButton.click();

        WebElement sortZA = driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]/option[5]"));
        sortZA.click();

        WebElement listButton = driver.findElement(By.xpath("//*[@id=\"list\"]/a/i"));

        WebElement addToCardButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]"));

        driver.quit();
    }
}
