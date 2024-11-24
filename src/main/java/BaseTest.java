import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseTest {
    WebDriver driver;
    public BaseTest(WebDriver driver)
    {
        this.driver=driver;
    }
    public void handleAlert(String alertType)
    {
        if(alertType.equalsIgnoreCase("JS Alert")){
            handleAlert();
        }
    }
    private void handleAlert()
    {
        WebElement element = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        element.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text : "+alert.getText());
        alert.accept();
    }
}
