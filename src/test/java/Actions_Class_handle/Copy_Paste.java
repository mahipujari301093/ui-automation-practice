package Actions_Class_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Copy_Paste {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("firstName")).sendKeys("Copy paste example");

        Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        Thread.sleep(3000);

        act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

        Thread.sleep(3000);
        driver.quit();

    }
}

/*
❓ How do you perform copy-paste in Selenium?
Using Actions class with keyDown() and keyUp()
To press and hold the key we used -> keyDown
To release the key we used -> keyUp

 */