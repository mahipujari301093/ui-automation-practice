package element_validation_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodsExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");

        // 1️⃣ getCurrentUrl()
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // 2️⃣ getTitle()
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // 3️⃣ getText()
        String headerText = driver.findElement(By.className("text-center")).getText();
        System.out.println("Header Text: " + headerText);
        driver.quit();
    }

}
