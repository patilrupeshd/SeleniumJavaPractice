package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class WebTableTwo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://cosmocode.io/automation-practice-webtable/");
       
        WebElement element = driver.findElement(By.tagName("table"));

        List<WebElement> rows = element.findElements(By.tagName("tr"));

        for(WebElement row  : rows)
        {
            List<WebElement> cell = row.findElements(By.tagName("td"));

            Actions actions = new Actions(driver);
            if(cell.size() > 3 && cell.get(3).getText().contains("Euro"))
            {
                WebElement checkbox = cell.get(0).findElement(By.tagName("input"));
                if(!checkbox.isSelected())
                {
                   // actions.scrollToElement(checkbox).build().perform();
                    JavascriptExecutor js = (JavascriptExecutor)driver;
                    js.executeScript("arguments[0].scrollIntoView(true)",checkbox);
                    checkbox.click();
                }
            }
        }
       File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screen,new File(System.getProperty("user.home")+"/Downloads/screen.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // System.out.println("Country Selected " + count);
        driver.quit();
    }

}
