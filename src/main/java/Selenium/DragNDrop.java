package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragNDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Static.html");

        WebElement logo = driver.findElement(By.id("angular"));

        WebElement dropArea = driver.findElement(By.id("droparea"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(logo,dropArea).build().perform();



        Thread.sleep(3000);

        driver.quit();
    }
}
