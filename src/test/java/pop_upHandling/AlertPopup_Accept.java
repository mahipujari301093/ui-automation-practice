package pop_upHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertPopup_Accept {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();


        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Result after clicking OK: " + result);

        Thread.sleep(2000);
        driver.quit();

    }

}

/*
🧠 How Selenium Handles Alerts
Selenium uses the Alert interface:
driver.switchTo().alert().accept();

| Method       | Purpose                  |
| ------------ | ------------------------ |
| `accept()`   | Click OK                 |
| `dismiss()`  | Click Cancel             |
| `getText()`  | Get alert message        |
| `sendKeys()` | Enter text (Prompt only) |

🧠 Why accept() is used

Simple alert pop-ups have only one option → OK

accept() simulates clicking the OK button

 */
