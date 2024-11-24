package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class Frame {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/frames']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement framePage = driver.findElement(By.xpath("//div[@id=\"content\"]//h3"));
        String getText = framePage.getText();
        if(getText.equals("Frame"))
        {

            System.out.println("Frame page is display");
        }
        else {
            System.out.println("Frame Page is not visible ");
        }
        WebElement iFrame = driver.findElement(By.xpath("//a[@href='/iframe']"));
        iFrame.click();

        String headerText = "An iFrame containing the TinyMCE WYSIWYG Editor";
        WebElement framePage1 = driver.findElement(By.xpath("//div[@id=\"content\"]//h3"));
        String actualText = framePage1.getText();
        if(actualText == headerText)
        {
            System.out.println("iFrame Text is Visible");
        }
        else {
            System.out.println("iFrame text is not Visible");
        }
        WebElement fileMenu = driver.findElement(By.xpath("//button[@role='menuitem']//span[contains(text(),'File')]"));
        fileMenu.click();

        WebElement newDocument = driver.findElement(By.xpath("//div[@role='menuitem']//div[contains(text(),'New document')]"));
        newDocument.click();

        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

        WebElement editorBody = driver.findElement(By.id("tinymce"));
        editorBody.clear();
        editorBody.sendKeys("Finally you reach");
        System.out.println("Done");
        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(screenShot.toPath(),new File("Test.png").toPath());

        driver.switchTo().defaultContent();
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
