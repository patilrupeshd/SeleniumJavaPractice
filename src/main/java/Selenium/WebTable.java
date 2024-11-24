package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class WebTable {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://cosmocode.io/automation-practice-webtable/");


        List<WebElement> countriesList = driver.findElements(By.xpath("//table[@id='countries']//tr[td[4]='Euro']/td[2]"));
        for(WebElement ele : countriesList)
        {
            System.out.println(ele.getText());
        }
        driver.navigate().refresh();


        driver.quit();
    }
}
