package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit_Wait {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        // Create Explicit Wait object

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until First Name field is visible
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys("Vishal");


        // Wait until Last Name field is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastName"))).sendKeys("Pujari");


        // Wait until Phone field is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("phone"))).sendKeys("9096290478");

        // Wait until Email field is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName"))).sendKeys("mahipujari@gmail.com");


        // Pause only to visually verify
        Thread.sleep(3000);
        driver.close();

    }
}

/*

🔍 How Explicit Wait Works in THIS Code
wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));

Selenium does this internally:

Looks for element

If not visible, waits

Re-checks every ~500 ms

Stops waiting as soon as it becomes visible

Fails after 10 seconds with TimeoutException

🎯 Interview One-Liner

Explicit wait waits for a specific condition on a particular element before performing an action.


🎯 What YOU Should Focus On (As a Learner)
✔ visibilityOfElementLocated
✔ elementToBeClickable
✔ presenceOfElementLocated
✔ invisibilityOfElementLocated



🧠 Interview-Ready Answer (Best One)
ExpectedConditions class contains multiple static methods (around 20+) used with Explicit Wait to
wait for different conditions like visibility, clickability, presence, alerts, frames, titles, and URLs. real
time projects, we mainly use visibility and clickability conditions.

 */