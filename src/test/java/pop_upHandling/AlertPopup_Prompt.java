package pop_upHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertPopup_Prompt {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();

        // Switch to alert
        driver.switchTo().alert().sendKeys("Hello Selenium");


        Thread.sleep(2000);

        // Click OK button
        driver.switchTo().alert().accept();

        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Result after clicking OK: " + result);

        Thread.sleep(2000);
        driver.quit();


    }
}
