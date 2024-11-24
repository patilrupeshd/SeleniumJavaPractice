package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       // WebDriverWait driverWait = new WebDriverWait( new SystemClock(), Driver, TimeSpan.FromSeconds( 20 ), TimeSpan.FromSeconds( 3 ) );
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown")));

        Select select = new Select(dropdown);

        List<WebElement> elements = select.getOptions();

        for (WebElement element : elements)
        {
            System.out.println(element.getText());

        }
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).click().perform();
        Thread.sleep(5000);
        select.selectByVisibleText("Option 2");
        Thread.sleep(5000);
        driver.quit();
    }
}
