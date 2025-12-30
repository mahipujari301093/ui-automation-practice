package Actions_Class_handle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollExample_JScript {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php?utm_source=chatgpt.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Scroll down by 400 pixels using JavaScript

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        Thread.sleep(3000);

        // Scroll up by 400 pixels using JavaScript
        js.executeScript("window.scrollBy(0,-400)");

        Thread.sleep(3000);
        driver.quit();

    }
}

/*

✅ What is JavascriptExecutor in Selenium?
JavascriptExecutor is a Selenium interface that allows us to execute JavaScript code directly inside the
browser from our Selenium test.

👉 In simple words:
When Selenium cannot do something directly, we use JavaScriptExecutor to do it.

👉 JavaScript interacts directly with the browser, so it is more powerful.

JavascriptExecutor is an interface in Selenium used to execute JavaScript code inside the browser
when Selenium methods are not sufficient.
 */