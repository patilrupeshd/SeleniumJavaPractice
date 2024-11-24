package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/download']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement framePage = driver.findElement(By.xpath("//div[@id=\"content\"]//h3"));
        String getText = framePage.getText();
        if(getText.equals("File Downloader"))
        {

            System.out.println("File Downloader page is display");
        }
        else {
            System.out.println("File Downloader Page is not visible ");
        }
        File exstigngFile = new File(System.getProperty("user.home") + "/Downloads/sample.pdf");
        if(exstigngFile.exists())
        {
           exstigngFile.delete();
        }

        WebElement textFileLink = driver.findElement(By.linkText("sample.pdf"));
        textFileLink.click();
        Thread.sleep(1000);

        File downloadFile = new File(System.getProperty("user.home") + "/Downloads/sample.pdf");
        if(downloadFile.exists())
        {
            System.out.println("File is download successful");
        }
        else {
            System.out.println("File is not download successful");
        }
        driver.quit();
    }
}
