package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Implicit_Wait {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // 2. Apply Implicit Wait (GLOBAL WAIT)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();

        // 4. Find elements (Selenium will wait automatically)

        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vishal");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Pujari");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9096290478");
        driver.findElement(By.id("userName")).sendKeys("mahipujari@gmail.com");
        Thread.sleep(4000);

        driver.close();


    }

}

    /*

   Correct & Clean Explanation (Final Version)
   With implicit wait set to 10 seconds, Selenium will wait up to 10 seconds to find each element.
   If the element is found within that time, Selenium immediately performs the action.
   If the element is not found within 10 seconds, Selenium throws a NoSuchElementException.

    What Selenium does internally:

1️⃣ Selenium searches for firstName
2️⃣ If found immediately → type text
3️⃣ If NOT found →
    ✔ wait 0.5s → try again
    ✔ repeat until 10s

❌ If still not found after 10s → NoSuchElementException



   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   Every findElement() gets up to 10 seconds

   Selenium checks every ~500 milliseconds

📌 This setting remains active until browser closes or wait time is changed.



     */


