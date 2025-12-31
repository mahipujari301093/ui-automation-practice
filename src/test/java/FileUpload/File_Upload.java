package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class File_Upload {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Upload file
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Vishal\\Downloads\\Adhar Madhuri.jpeg");

        // Click upload button
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(4000);
        driver.quit();

    }
}
