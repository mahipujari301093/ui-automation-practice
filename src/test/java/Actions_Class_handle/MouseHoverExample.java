package Actions_Class_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Element to hover on
        WebElement mainItem = driver.findElement(By.xpath("//a[text()='Main Item 2']"));

        // Create Actions class object
        Actions act = new Actions(driver);

        // Perform mouse hover action
        act.moveToElement(mainItem).perform();

        Thread.sleep(3000);
        driver.quit();

    }

}
