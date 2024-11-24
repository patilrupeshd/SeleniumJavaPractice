package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPageTest;

import java.time.Duration;

public class AlertHandingExpOverriding {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LoginPageTest loginPageTest = new LoginPageTest(driver);
        loginPageTest.handleAlert("JS Alert");
        Thread.sleep(10);
        driver.close();
    }
}
