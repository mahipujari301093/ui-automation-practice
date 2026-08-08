package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Handle_Iframe {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Switch to iframe using WebElement

        WebElement ref = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(ref);

        // peroform action inside iframe
        driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();

        // Switch back to main page after performing action inside iframe

        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("menuButton")).click();

        Thread.sleep(3000);
        driver.quit();


    }


}


/*

If a webpage has two iFrames, Selenium cannot directly interact with elements

Main Page
   ↓
Switch to iFrame 1
   ↓
Perform action
   ↓
Switch back to Main Page


If a webpage contains multiple iFrames, we need to switch Selenium's focus to the required iFrame before interacting with its elements, and switch back to the main page using defaultContent() when required.













*/