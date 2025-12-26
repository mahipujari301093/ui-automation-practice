package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementToBeClickableExample {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/index.php");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter username

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName"))).sendKeys("test");

        // Enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("test");

        // Wait until Submit button is clickable and then click
        wait.until(ExpectedConditions.elementToBeClickable(By.name("submit"))).click();

        // Pause to visually verify - only to see result
        Thread.sleep(3000);
        driver.close();


    }
}

/*

🎯 Interview One-Liner

elementToBeClickable waits until an element is visible and enabled before performing a click action.
commonly used for login and submit buttons.

 */