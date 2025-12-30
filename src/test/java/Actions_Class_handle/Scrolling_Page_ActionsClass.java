package Actions_Class_handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Scrolling_Page_ActionsClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php?utm_source=chatgpt.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Actions act = new Actions(driver);

        // Scroll down by 300 pixels
        act.scrollByAmount(0,300).perform();

        Thread.sleep(2000);

        // Scroll up by 300 pixels
        act.scrollByAmount(0,-300).perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
