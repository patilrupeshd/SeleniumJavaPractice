package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridDemo {

    WebDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
      
                setup();
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL("http://192.168.1.7:4444"),dc);
    }

    @Test
    public void testGoogle()
    {
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Selenium Grid 4");

        search.submit();

        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void terDown()
    {
        if (driver!=null)
            driver.quit();
    }


}
