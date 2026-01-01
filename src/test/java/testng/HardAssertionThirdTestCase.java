package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertionThirdTestCase {


    @Test
    public void verifyLoginButtonEnabled() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");

        boolean loginButton = driver.findElement(By.name("login")).isEnabled();

        Assert.assertTrue(loginButton);

        System.out.println("Login button is enabled: Test case passed");
        driver.quit();


    }
}