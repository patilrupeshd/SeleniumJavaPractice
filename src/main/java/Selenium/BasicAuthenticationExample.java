package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BasicAuthenticationExample {

    public static void main(String[] args) throws AWTException, InterruptedException {

       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();

        Robot  robot = new Robot();
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);


        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(10);

        //Alert alert = driver.switchTo().alert();
        //alert.au

        WebElement contain = driver.findElement(By.id("content"));
        String font = contain.getCssValue("color");
        String fontSize = contain.getCssValue("fontSize");
        System.out.println("Font " + font + " _  fontSize " + fontSize);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));

        System.out.println(contain.getText());



       /* Alert alert = driver.switchTo().alert();
        Actions actions = new Actions(driver);
        actions.sendKeys("admin")
                .sendKeys("\t")
                .sendKeys("admin")
                .sendKeys("\n")
                .perform();
        */

        //String credentials = "admin:admin";
        //alert.sendKeys(credentials);
        //alert.accept();

        //Credentials credentials = new UsernameAndPassword("admin","admin");


        //driver.switchTo().alert().authe
        driver.quit();
    }
}
