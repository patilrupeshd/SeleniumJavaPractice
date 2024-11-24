package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/upload']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement framePage = driver.findElement(By.xpath("//div[@id=\"content\"]//h3"));
        String getText = framePage.getText();
        if(getText.equals("File Uploader"))
        {

            System.out.println("File Uploader page is display");
        }
        else {
            System.out.println("File Uploader Page is not visible ");
        }

        WebElement chooseFiletoUpload = driver.findElement(By.id("file-upload"));
        chooseFiletoUpload.sendKeys(new File(System.getProperty("user.home") + "/Downloads/sample.pdf").getAbsolutePath());

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement successMessage = driver.findElement(By.tagName("h3"));
        if(successMessage.getText().equals("File Uploaded!"))
        {
            System.out.println("file is uploaded ");
        }
        else
        {
            System.out.println("File is not upload");
        }

        driver.quit();
    }
}
