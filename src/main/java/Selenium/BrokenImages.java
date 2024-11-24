package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import java.time.Duration;
import java.util.List;

public class BrokenImages {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/broken_images']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        // WebDriverWait driverWait = new WebDriverWait( new SystemClock(), Driver, TimeSpan.FromSeconds( 20 ), TimeSpan.FromSeconds( 3 ) );
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));

        List<WebElement> imgs = driver.findElements(By.tagName("img"));
        int isbroken = 0;
        for (WebElement img : imgs)
        {
           // String src = img.getAttribute("img");
            if (img != null)
            {
             //   CloseableHttpClient client = HttpClientBuilder.create().build();
             //   HttpGet request = new HttpGet(img.getAttribute("src"));
             //   CloseableHttpResponse response = client.execute(request);
              //  if (response.getCode() != 200)
                {
                    System.out.println("Broken Image " + img.getAttribute("outerHTML") + " is Broken");
                    isbroken++;
                }
//                if(img.getAttribute("naturalWidth").equals(0))
//                {
//                    System.out.println("Broken Image " + img.getAttribute("outerHTML") + " is Broken");
//                    isbroken++;
//                }
            }
        }
        System.out.println(isbroken + " Are Broken");
        driver.quit();
    }

}
