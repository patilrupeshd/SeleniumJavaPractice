package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SteupGrid {
    private Process hubProcess;
    private Process nodeProcess;
    private WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        SteupGrid sg = new SteupGrid();
            sg.setup();
            sg.test();
            sg.tearDown();

    }

    public void setup() throws IOException, InterruptedException {
        startHub();
        startNode();
        waitForNodeRegistration();
        initWebDriver();
    }

    public void test()
    {
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Selenium Grid 4");

        search.submit();

        System.out.println(driver.getTitle());
    }


    public void tearDown()
    {
        if (driver!=null)
        {
            driver.quit();
        }
        stopHubAndNode();
    }
    private void stopHubAndNode()
    {
        if(hubProcess!=null)
        {
            hubProcess.destroy();
            System.out.println("Hun Stopped");
        }
        if (nodeProcess!=null)
        {
            nodeProcess.destroy();
            System.out.println("Node Stopped");
        }
    }

    private void startHub() throws IOException {
        ProcessBuilder processBuilder =  new ProcessBuilder("java","-jar","C:\\Users\\T450\\Downloads\\selenium-server-4.21.0.jar","hub");
        //processBuilder.directory();
        hubProcess = processBuilder.start();
        logProcessOutPut(hubProcess,"Hub");
        System.out.println("Hub started ");

   }

   private void startNode() throws IOException {
       ProcessBuilder processBuilder = new ProcessBuilder("java","-jar","C:\\Users\\T450\\Downloads\\selenium-server-4.21.0.jar","node");
       nodeProcess = processBuilder.start();
       logProcessOutPut(nodeProcess,"Node");
       System.out.println("Node started ");
   }

   private void waitForNodeRegistration() throws InterruptedException {
       int retry = 20;
       boolean isRegistered = false;
       while (retry > 0 && !isRegistered)
       {
           try {
               URL url = new URL("http://192.168.1.7:4444/");
               HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = br.readLine())!=null)
                {
                    content.append(inputLine);
                }
                br.close();
                con.disconnect();

                if(content.toString().contains("successfully registered to the hub and ready to use"))
                {
                    isRegistered=true;
                    System.out.println("Node successfully registered with the Hub.");
                }else {
                    System.out.println("Waiting for Node to register...");
                    TimeUnit.SECONDS.sleep(10);
                }
           } catch (IOException e) {
               System.err.println("Error Checking node registration status :"  + e.getMessage());
           }
           retry--;
       }
       if(!isRegistered)
       {
           throw new RuntimeException();
       }
   }
   private void initWebDriver() throws MalformedURLException {
     
       DesiredCapabilities dc = new DesiredCapabilities();
       dc.setBrowserName("chrome");
       driver = new RemoteWebDriver(new URL("http://192.168.1.7:4444/"),dc);

   }

    private void logProcessOutPut(Process process,String processName)
    {
        new Thread(()->{
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            reader.lines().forEach(line-> System.out.println(processName + " Output: " + line));
        }).start();

        new Thread(()->{
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            reader.lines().forEach(line -> System.err.println(processName + " Error: " + line));
        }).start();
    }
}
