package Actions_Class_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ArrowDownKey {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("APjFqb")).sendKeys("Selenium");

        Thread.sleep(3000);

        Actions act = new Actions(driver);

        act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.ENTER).perform();

        Thread.sleep(3000);
        driver.quit();

    }
}

/*
we have done multiple operation hence we used build().perform()

 */