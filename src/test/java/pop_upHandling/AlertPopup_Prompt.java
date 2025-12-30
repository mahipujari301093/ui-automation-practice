package pop_upHandling;

import org.openqa.selenium.Alert;
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
        Alert alert = driver.switchTo().alert();

        // Enter text
        alert.sendKeys("Hello Selenium");

        Thread.sleep(3000);

        // Click OK button
        alert.accept();

        Thread.sleep(2000);
        driver.quit();









    }
}
