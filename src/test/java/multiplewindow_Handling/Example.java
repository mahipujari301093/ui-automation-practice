package multiplewindow_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@class='blinkingText']")).click();

        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();

        System.out.println("Parent Window ID: " + parentWindow);
        System.out.println("Child Window ID: " + childWindow);

        // Switch to child window
        driver.switchTo().window(childWindow);
        driver.findElement(By.xpath("//*[@class='login-btn'][2]")).click();
        driver.findElement(By.id("email")).sendKeys("mahipujari2gmail.com");

        Thread.sleep(3000);
        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("username")).sendKeys("mahipujari2gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");

        Thread.sleep(3000);
        driver.quit();

    }
}


/*
✅ Correct version

getWindowHandle() → returns ONLY the current (parent) window ID
String parent = driver.getWindowHandle();

getWindowHandles() → returns ALL open window IDs
Set<String> allWindows = driver.getWindowHandles();

What Iterator Does
we use an Iterator to traverse each window ID one by one.
The next() method moves the pointer forward and returns the next window ID

 */