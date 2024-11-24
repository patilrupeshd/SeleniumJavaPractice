package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleAddHandel {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://automationexercise.com/");

        handelGoogleAdsPopUP(driver);
        driver.quit();
    }

    public static void handelGoogleAdsPopUP(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("google-ad-popup")));

        if (popup.isDisplayed())
        {
            WebElement closeButton = popup.findElement(By.className("close-button"));
            closeButton.click();
        }
    }
}
