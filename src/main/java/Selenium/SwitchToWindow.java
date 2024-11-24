package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class SwitchToWindow {
    //*[@class='dropdown']/a[contains(.,'SwitchTo')]
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Register.html");

        String mainWindowHandle = driver.getWindowHandle();
        WebElement hoverToElement = driver.findElement(By.xpath("//*[@class='dropdown']/a[contains(.,'SwitchTo')]"));
        Actions actions =new Actions(driver);
        actions.moveToElement(hoverToElement).build().perform();

        WebDriverWait driverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='dropdown-menu']//a[contains(.,'Windows')]")));


        WebElement windowsSubMenu = driver.findElement(By.xpath("//*[@class='dropdown-menu']//a[contains(.,'Windows')]"));
        windowsSubMenu.click();

        WebElement OpenSeperateMultipleWindows = driver.findElement(By.xpath("//*[@class='tabpane pullleft']//a[contains(.,'Open Seperate Multiple Windows')]"));
        OpenSeperateMultipleWindows.click();
        //*[@id="Multiple"]//button
        WebElement button = driver.findElement(By.xpath("//*[@id=\"Multiple\"]//button"));
        button.click();

        Set<String> windowsHandel = driver.getWindowHandles();

        for (String str : windowsHandel)
        {
            if(!str.equals(mainWindowHandle))
            {
                driver.switchTo().window(str);
                break;
            }
        }
        boolean isSkipToDemoButtonPresent = driver.findElement(By.id("enterimg")).isDisplayed();
        System.out.println("Is 'Skip to demo' button present: " + isSkipToDemoButtonPresent);

        // Switch back to the main page (parent window)
        driver.close(); // Close the child window
        driver.switchTo().window(mainWindowHandle);

        // Confirm that we are back on the main page
        System.out.println("Current URL: " + driver.getCurrentUrl());


        driver.quit();

    }
}
