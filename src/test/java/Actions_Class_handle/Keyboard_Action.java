package Actions_Class_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Keyboard_Action {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("firstName")).click();

        Actions act = new Actions(driver);
        act.sendKeys("Vishal").sendKeys(Keys.TAB).build().perform();
        act.sendKeys("Pujari").sendKeys(Keys.TAB).build().perform();
        act.sendKeys("9096290478").sendKeys(Keys.TAB).build().perform();
        act.sendKeys("mahipujari@gmail.com").sendKeys(Keys.TAB).build().perform();

        Thread.sleep(3000);
        driver.quit();





    }
}
