import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Checked Exception Example
        try {
            WebDriver driver = getChromeDriver();


        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Unchecked Exception Example
       // int[] numbers = {1, 2, 3};
        //System.out.println("Element at index 3: " + numbers[3]);
    }

    // Method throwing a checked exception
    public static WebDriver getChromeDriver() throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        Thread.sleep(2000); // Simulating a checked exception
        return driver;
    }
}
