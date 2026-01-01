package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class HardAssertionSecondTestCase {


    @Test()
    public void verifyLogoIsDisplayed()
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");

        boolean logoStatus = driver.findElement(By.xpath("//*[@class = 'fb_logo _8ilh img']")).isDisplayed();

        Assert.assertTrue(logoStatus);

        System.out.println("Logo is displayed: Test case passed");
        driver.quit();
    }
}

/*

👉 Assert.assertTrue() always needs a boolean condition true/false to validate.
If the condition is true, the test execution continues.
If the condition is false, the hard assertion stops the execution immediately and the remaining code will
not be executed.

📌 When to Use assertTrue (Real Time)

✔ Element displayed
✔ Element enabled
✔ URL contains text
✔ Title contains text
✔ Success message visible

 */