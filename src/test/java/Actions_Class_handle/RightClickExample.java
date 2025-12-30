package Actions_Class_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

        Actions act = new Actions(driver);

        act.contextClick(rightClickBtn).perform();

        Thread.sleep(3000);
        driver.quit();

    }
}
