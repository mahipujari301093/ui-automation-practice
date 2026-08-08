package pop_upHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertPopup_Dismiss {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();

        Thread.sleep(2000);

        // Switch to alert
        driver.switchTo().alert().dismiss();

        String result = driver.findElement(By.id("result")).getText();

        System.out.println("Result after clicking Cancel: " + result);
        

        Thread.sleep(2000);
        driver.quit();

    }

}

/*
🧠 Explanation (Simple)

accept() → clicks OK

dismiss() → clicks Cancel


// Click Cancel
alert.dismiss();

dismiss() is used when an alert pop-up has two options (OK and Cancel) and we want to click the Cancel button.

 */